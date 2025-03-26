public class Video implements AcoesVideo {
    private String titulo;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    //[private]= encapsulamento

    //------------get set-------------
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    //-------------------------
    public int getviews(){
        return views;
    }
    public void setviews(int views){
        this.views=views;
    }
    //-------------------------
    public int getcurtidas(){
        return curtidas;
    }
    public void setcurtidas(int curtidas){
        this.curtidas=curtidas;
    }
    //-------------------------
    public boolean getreproduzindo(){
        return reproduzindo;
    }
    public void setreproduzindo(boolean reproduzindo){
        this.reproduzindo=reproduzindo;
    }

    //-----metodo construtor------
    public Video(String titulo){
        this.settitulo(titulo);
        this.setviews(0);
        this.setcurtidas(0);
        this.setreproduzindo(false);
    }

    //-----------metodos-----------
    @Override
    public void play() {
        this.setreproduzindo(true);
    }

    @Override
    public void pause() {
        this.setreproduzindo(false);
    }

    @Override
    public void like() {
        this.setcurtidas(this.getcurtidas()+1);
    }

    @Override
    public String toString(){
        return "Video-> titulo: "+this.gettitulo()+", views: "+this.getviews()+
                ", curtidas: "+this.getcurtidas()+", reproduzindo: "+this.getreproduzindo();
    }

}
