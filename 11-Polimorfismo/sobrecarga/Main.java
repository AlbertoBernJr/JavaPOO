public class Main
{
    public static void main(String[] args) {
        //Animal n=new Animal(); //não pode porque a classe é abstrata
        Mamifero m=new Mamifero();
        Lobo c=new Lobo();
        Cachorro k=new Cachorro();

        m.emitirsom();
        c.emitirsom();
        k.emitirsom();
        k.reagir(true);
        k.reagir("olá");
        k.reagir(16);

    }
}
