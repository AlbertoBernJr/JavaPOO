public class Gafanhoto extends Pessoa{
    private String login;
    private int totalassistido;

    //------------get set-------------
    public String getlogin(){
        return login;
    }
    public void setlogin(String login){
        this.login=login;
    }
    //-------------------------
    public int gettotalassistido(){
        return totalassistido;
    }
    public void settotalassistido(int totalassistido){
        this.totalassistido=totalassistido;
    }

    //---------metodo construtor------------
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome,idade,sexo);
        //[super] = chama a super-classe [Pessoa]

        this.setlogin(login);
        this.settotalassistido(0);
    }

    @Override
    public String toString(){
        return "Gafanhoto-> login: "+this.getlogin()+", Assistido: "+this.gettotalassistido()+ super.toString();
        //[super.toString()] = chama os atributos da super-classe [Pessoa]
    }
}
