public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Caneta: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("esta Tampada? "+this.tampada);
    }

    public void rabiscar(){
        if(this.tampada==true){
            System.out.println("ERRO! Esta tampada, nao pode rabiscar. ");

        }else{
            System.out.println("Rabiscando...");
        }

    }

    protected void tampar(){
        this.tampada=true;
    }

    protected void destampar(){
        this.tampada=false;
    }
}
