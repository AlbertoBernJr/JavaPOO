public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    //------------get set-------------
    public Gafanhoto getespectador(){
        return espectador;
    }
    public void setespectador(Gafanhoto espectador){
        this.espectador=espectador;
    }
    //-------------------------
    public Video getfilme(){
        return filme;
    }
    public void setfilme(Video filme){
        this.filme=filme;
    }

    //---metodo construtor---
    public Visualizacao(Video filme, Gafanhoto espectador){
        this.setespectador(espectador);
        this.setfilme(filme);
        this.espectador.settotalassistido(this.espectador.gettotalassistido()+1);
        //acrescentará + 1 em [total assistido] da classe [Gafanhoto]

        this.filme.setviews(this.filme.getviews()+1);
        //acrescentando +1 em [views] da classe [Video]
    }

    @Override
    public String toString() {
        return "-------------------\nVisualização-> \n|FILME| " + this.getfilme() + ", " +
                "\n|ESPECTADOR| " + this.getespectador() + "\n-------------------";
    }
    //---------metodos----------
    public void like(){
        this.filme.setcurtidas(this.filme.getcurtidas()+1);
    }
}
