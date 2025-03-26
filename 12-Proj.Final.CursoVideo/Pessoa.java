public abstract class Pessoa {
//classe abstrata = não pode criar objetos, só serve para ser herdada

    protected String nome;
    protected int idade;
    protected String sexo;

    //------------get set-------------
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    //-------------------------
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    //-------------------------
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }

    //---------metodo construtor------------
    public Pessoa(String nome, int idade, String sexo){
        this.setnome(nome);
        this.setidade(idade);
        this.setsexo(sexo);
    }

    @Override
    public String toString(){
        return "\n  - Pessoa-> titulo: " + this.getnome() + ", idade: " + this.getidade() +
                ", sexo: " + this.getsexo();
    }


}
