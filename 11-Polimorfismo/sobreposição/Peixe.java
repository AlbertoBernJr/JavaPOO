public class Peixe extends Animal{
    private String corescama;

    public String getcorescama(){
        return corescama;
    }
    public void setcorescama(String corescama){
        this.corescama=corescama;
    }

    //----------metodos------
    @Override
    public void locomover(){
        System.out.println("nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirsom(){
        System.out.println("som de peixe");
    }
}
