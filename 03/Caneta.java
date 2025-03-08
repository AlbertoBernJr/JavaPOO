public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //--------------------------------------------------
    public void Caneta(){
        //metodo construtor - tem o mesmo nome da classe
        this.tampar();
        this.cor="preto";
        // quando o objeto [Caneta] for criado, estará tampado e será preto
    }

    public void tampar(){
        this.tampada=true;
    }
    //--------------------------------------------------------
    public String getModelo(){
        /*não pode ser [void] porque retorna um modelo -> tem que ser [String]
        para retornar uma [String] */
        return this.modelo;
    }
    public void setModelo(String m){
        // adicionando parametro [String m] no metodo [set]
        //pode ser [void] porque não fará retorno de informações
        //adicionará a informação de [m] para [modelo]
        this.modelo=m;
    }
    //-------------------------------------------
    public float getPonta(){
        /*não pode ser [void] porque retorna um modelo -> tem que ser [float]
        para retornar uma [float] */
        return this.ponta;
    }
    public void setPonta(float p){
        //pode ser [void] porque não fará retorno de informações
        //adicionará a informação de [p] para [ponta]
        this.ponta=p;
    }
    //-------------------------------------------
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }

}
