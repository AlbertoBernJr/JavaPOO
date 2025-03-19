public abstract class Pessoa {
//[abstract] = a classe [Pessoa] não pode criar objeto na classe [Main]
  
    protected String nome;
    protected int idade;
    protected String sexo;

    //--------------get/set-------------
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    //-------
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    //-------
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }

    //-----metodo cosntrutor------
    public void fazeraniversario(){
        this.setidade(this.getidade()+1);
    }

    @Override
    public String toString(){
        return "Pessoa- nome: "+this.getnome()+", idade: "+this.getidade()+", sexo: "+this.getsexo();
        //tem que terminar com [return]
    }
}
