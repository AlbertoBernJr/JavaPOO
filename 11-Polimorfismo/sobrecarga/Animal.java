public abstract class Animal{
//classe abstrata não pode criar objeto no [Main]
//usada para suas sub-classes herdarem seus metodos e atrributos

    protected float peso;
    protected int idade;

    //----------get set -----------
    public float getpeso(){
        return peso;
    }
    public void setpeso(float peso){
        this.peso=peso;
    }
    //-----------
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }

    //----------metodos------
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirsom();
}
