public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //-------------metodo construtor-------------
    //informar todas esses dados na hora da criação do objeto
    public Lutador(String nome, String nacionalidade, int idade,
                   float altura, float peso, int vitorias, int derrotas,
                   int empates){
        this.setnome(nome);
        this.setnacionalidade(nacionalidade);
        this.setidade(idade);
        this.setaltura(altura);
        this.setpeso(peso);
        this.setvitorias(vitorias);
        this.setderrotas(derrotas);
        this.setempates(empates);
    }

    //-------------------get/set-------------------
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    //--------
    public String getnacionalidade(){
        return nacionalidade;
    }
    public void setnacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }
    //--------
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    //--------
    public float getaltura(){
        return altura;
    }
    public void setaltura(float altura){
        this.altura=altura;
    }
    //--------
    public float getpeso(){
        return peso;
    }
    public void setpeso(float peso){
        this.peso=peso;
        this.setcategoria();
        // chama o [setcategoria] para analisar o peso e definir a categoria
    }
    //--------
    public String getcategoria(){
        return categoria;
    }
    public void setcategoria(){
    //condições para determinar o peso
        if(this.getpeso()<52){
            this.categoria="Inválido";
        }else if(this.getpeso()<=70){
            this.categoria="Leve";
        }else if(this.getpeso()<=84){
            this.categoria="Médio";
        }else if(this.getpeso()<=120){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }

    }
    //--------
    public int getvitorias(){
        return vitorias;
    }
    public void setvitorias(int vitorias){
        this.vitorias=vitorias;
    }
    //--------
    public int getderrotas(){
        return derrotas;
    }
    public void setderrotas(int derrotas){
        this.derrotas=derrotas;
    }
    //--------
    public int getempates(){
        return empates;
    }
    public void setempates(int empates){
        this.empates=empates;
    }


    //-----------------metodos-----------
    public void apresentar(){
        System.out.println("---------");
        System.out.println("Lutador: "+this.getnome());
        System.out.println("Local: "+this.getnacionalidade());
        System.out.println("idade: "+this.getidade());
        System.out.println("Vitórias: "+this.getvitorias());
        System.out.println("Derrotas: "+this.getderrotas());
        System.out.println("Empates: "+this.getempates());
        System.out.println("---------");
    }
    //----------
    public void status(){
        System.out.println("O lutador "+this.getnome()+" é peso "+this.getcategoria());
        System.out.println("Vitórias: "+this.getvitorias());
        System.out.println("Derrotas: "+this.getderrotas());
        System.out.println("Empates: "+this.getempates());
        System.out.println("---------");
    }
    //--------------
    public void ganharluta(){
        this.setvitorias(this.getvitorias()+1);
    }
    //--------------
    public void perderluta(){
        this.setderrotas(this.getderrotas()+1);
    }
    //--------------
    public void empatarluta(){
        this.setempates(this.getempates()+1);
    }

}
