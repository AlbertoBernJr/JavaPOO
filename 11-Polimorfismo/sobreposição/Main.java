public class Main
{
    public static void main(String[] args) {
        //Animal n=new Animal(); //não pode porque a classe é abstrata
        Mamifero m=new Mamifero();
        Peixe p=new Peixe();
        Reptil r=new Reptil();
        Ave a=new Ave();
        Canguru c=new Canguru();
        Cachorro k=new Cachorro();

        p.locomover();
        r.locomover();
        a.locomover();
        c.locomover();
        k.locomover();
        k.emitirsom();
    }
}
