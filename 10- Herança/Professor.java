public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    //-------------get/set-----------
    public String getespecialidade(){
        return especialidade;
    }
    public void setespecialidade(String especialidade){
        this.especialidade=especialidade;
    }
    //----
    public float getsalario(){
        return salario;
    }
    public void setsalario(float salario){
        this.salario=salario;
    }

    //--------------------metodo especial-------------------
    public void receberaumento(float aumento){
        this.setsalario(this.getsalario()+aumento);
    }

    @Override
    public String toString(){
        return "Pessoa- nome: "+this.getnome()+", idade: "+this.getidade()+", sexo: "+this.getsexo()+
                ", categoria: Professor, especialidade: "+this.getespecialidade();
        //tem que terminar com [return]
    }
}
