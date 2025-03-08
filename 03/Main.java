public class Main {
    public static void main(String[] args) {
        Caneta c1=new Caneta(); //objeto [Caneta] foi criado
        c1.setModelo("Bic"); //chamando o método [setModelo] para adicionar o valor [Bic]
        c1.setPonta(0.5f);
        //[set] para adicionar uma informação ao atributo

        c1.status();
        System.out.println("------------");
        System.out.println("Minha caneta é: "+c1.getModelo()+" com ponta "+c1.getPonta());
        //usar o metodo [get] para receber informação do atributo
    }
}
