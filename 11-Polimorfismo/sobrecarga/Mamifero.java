public class Mamifero extends Animal{
    private String corpelo;

    public String getcorpelo(){
        return corpelo;
    }
    public void setcorpelo(String corpelo){
        this.corpelo=corpelo;
    }

    //----------metodos------
    @Override
    public void locomover(){
        System.out.println("correndo");
    }

    @Override
    public void alimentar(){
        System.out.println("bebendo");
    }

    @Override
    public void emitirsom(){
        System.out.println("som de mamifero");
    }
}
