public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //-------------metodo construtor----------
    public ControleRemoto(){
        this.setvolume(20);
        this.setligado(true);
        this.settocando(false);
    }

    //-----------------set-get----------------------
    public int getvolume(){
        return volume;
    }
    public void setvolume(int volume){
        this.volume=volume;
    }
    //------------------------------------------
    public boolean getligado(){
        return ligado;
    }
    public void setligado(boolean ligado){
        this.ligado=ligado;
    }
    //------------------------------------------
    public boolean gettocando(){
        return tocando;
    }
    public void settocando(boolean tocando){
        this.tocando=tocando;
    }

    //------------metodos abstratos------------------
    //a classe implementa determinada interface
    //desenvolviemnto de todos os métodos que foram chamados na interface [Controlador]
    @Override //[override] = ja tinha o métodos escrito e agora estou escrevendo por cima
    public void ligar(){
        this.setligado(true);
    }

    @Override
    public void desligar(){
        this.setligado(false);
    }
    //-----------------------------------------------
    @Override
    public void abrirmenu(){
        System.out.println("esta ligado? "+this.getligado());
        System.out.println("esta tocando? "+this.gettocando());
        System.out.println("volume: "+this.getvolume());

        //exibindo o nivel do volume atual
        for(int i=0;i<=this.getvolume();i+=5){
            System.out.print("[ ]");
            //[..print()] = não faz quebra de linha
        }
    }

    @Override
    public void fecharmenu(){
        System.out.println("fechando menu...");
    }
    //-----------------------------------------
    public void maisvolume(){
        if(this.getligado()==true){//se estiver ligado [true]
            this.setvolume(this.getvolume()+5);
        }
    }

    public void menosvolume(){
        if(this.getligado()==true){
            this.setvolume(this.getvolume()-5);
        }
    }
    //--------------------------------------------
    @Override
    public void play(){
        if(this.getligado()==true && !(this.gettocando()==true)){
        //se estiver ligado e não estiver tocando

            this.settocando(true);
            //ativa o toque
        }
    }

    @Override
    public void pause(){
        if(this.getligado()==true && this.gettocando()==true){
        //se estiver ligado e tocando

            this.settocando(false);
            //desliga o toque
        }
    }
}
