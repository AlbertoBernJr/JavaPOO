public class Main {
    public static void main(String[] args) {
        //Pessoa p1=new Pessoa(); //classe [Pessoa] é abstrata e não pode ser instanciada
        Aluno al=new Aluno();
        Professor pr=new Professor();
        Visitante vi=new Visitante();
        Bolsista bo=new Bolsista();

        vi.setnome("Dan");
        vi.setidade(20);
        vi.setsexo("F");
        System.out.println(vi.toString());

        bo.setnome("Tadeu");
        bo.setidade(16);
        bo.setsexo("M");
        bo.setcurso("computação");
        System.out.println(bo.toString());

        pr.setnome("Fabio");
        pr.setidade(56);
        pr.setsalario(2.5f);
        pr.setsexo("M");
        pr.setespecialidade("Informatica");
        pr.getsalario();
        System.out.println(pr.toString());

    }
}
