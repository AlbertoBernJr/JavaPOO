public class Main {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();

        p2.setnome("jose");
        p2.setidade(20);
        p2.setcurso("cienc");
        p2.setsexo("M");

        p3.setnome("Lila");
        p3.setidade(45);
        p3.setsexo("F");

        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
