public class Ave extends Animal {
    private String corpena;

    //----get set ---
    public String getcorpena(){
        return corpena;
    }
    public void setcorpena(){
        this.corpena=corpena;
    }
    //----------metodos------
    @Override
    public void locomover(){
        System.out.println("voando");
    }

    @Override
    public void alimentar(){
        System.out.println("comendo fruta");
    }

    @Override
    public void emitirsom(){
        System.out.println("som de ave");
    }
}
