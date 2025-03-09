public class Main {
    public static void main(String[] args) {
        ContaBanco p1=new ContaBanco();
        //objeto [p1] foi criado a partir da classe [ContaBanco]

        p1.setnConta(12345);
        p1.setdono("Pessoa1");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(50);

        p1.sacar(100);
        p1.fecharConta();
        
        p1.estadoAtual();

        ContaBanco p2=new ContaBanco();
        p2.setnConta(67890);
        p2.setdono("Pessoa2");
        p2.abrirConta("CP");
        p2.depositar(300);
        p2.sacar(100);
        p2.estadoAtual();

    }
}
