public class Bolsista extends Aluno{
    private float bolsa;

    //-------get set------
    public float getbolsa(){
        return bolsa;
    }
    public void setbolsa(float bolsa){
        this.bolsa=bolsa;
    }

    //---metodo especial---
    public void renovarbolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getnome());
    }

    //--------metodo a ser sobreposto----
    @Override
    public void pagarmensalidade(){
        System.out.println(this.getnome()+" é bolsista. Pagamento facilitado!");
    }

}
