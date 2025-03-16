public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //----------get/set--------
    public int getmatricula(){
        return matricula;
    }
    public void setmatricula(int matricula){
        this.matricula=matricula;
    }
    //-------------
    public String getcurso(){
        return curso;
    }
    public void setcurso(String curso){
        this.curso=curso;
    }
    //-------------
    //--- metodo especial----
    public void cancelarmatricula(){
        System.out.println("Matrícula cancelada!");
    }
}
