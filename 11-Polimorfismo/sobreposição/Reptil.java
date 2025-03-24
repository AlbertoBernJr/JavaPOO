public class Reptil extends Animal{
    private String corescama;

    //--------get set--------
    public String getcorescama(){
        return corescama;
    }
    public void setcorescama(String corescama){
        this.corescama=corescama;
    }

    //----------metodos------
    @Override
    public void locomover(){
        System.out.println("rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("comendo vegetais");
    }

    @Override
    public void emitirsom(){
        System.out.println("som de reptil");
    }
}
