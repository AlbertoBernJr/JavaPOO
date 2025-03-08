public class Main {
    public static void main(String[] args) {
        Caneta c1=new Caneta();
        c1.modelo="bic"; 
        // pode ser executado porque é publico
      
        c1.cor="preto"; 
        // pode ser executado porque é publico
      
        //c1.ponta=0.5f; 
        // não pode ser executado porque é privado
      
        c1.carga=80; 
        /* pode ser executado porque esta dentro da classe que utiliza a classe [ Caneta ] > o objeto principal [c1] esta usando
        a classe [Caneta]*/
      
        c1.tampada=true;

        c1.status();
        c1.rabiscar();
    }
}
