import java.util.Random;
public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //-----------------get/set--------------

    public Lutador getdesafiado(){
        return desafiado;
    }

    public void setdesafiado(Lutador desafiado){
        this.desafiado=desafiado;
    }
    //----------
    public Lutador getdesafiante(){
        return desafiante;
    }
    public void setdesafiante(Lutador desafiante){
        this.desafiante=desafiante;
    }
    //----------
    public int getrounds(){
        return rounds;
    }
    public void setrounds(int rounds){
        this.rounds=rounds;
    }
    //----------
    public boolean getaprovada(){
        return aprovada;
    }
    public void setaprovada(boolean aprovada){
        this.aprovada=aprovada;
    }

    //----------metodos publicos-------
    public void marcarluta(Lutador l1, Lutador l2){
    //verificar se o Lutador [l1] pode lutar com o [l2]

        if(l1.getcategoria().equals(l2.getcategoria()) && l1 != l2){
        //verifica se estão na mesma categoria + não são o mesmo lutador
            this.setaprovada(true);
            this.setdesafiado(l1);
            this.setdesafiante(l2);
        }else{
        //se não forem da mesma categoria ou forem o mesmo lutador
            this.setdesafiante(null);
            this.setdesafiado(null);
            this.setaprovada(false);
        }
    }

    public void lutar(){
        if(this.getaprovada()){
        //se a luta for aprovada

            System.out.println("----Desafiado----");
            this.desafiado.apresentar();
            System.out.println("----Desafiante----");
            this.desafiante.apresentar();

            //resultado da luta
            //uma biblioteca aleatória/random irá decidir quem terá a vitória ou empate
            Random aleatorio=new Random();
            int vencedor = aleatorio.nextInt(3);
            //retornará 3 resultados: 0, 1 ou 2

            switch(vencedor){ //escolha
                case 0://empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;

                case 1://desafiado vence
                    System.out.print("Vitória do "+this.desafiado.getnome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;

                case 2://desafiante vence
                    System.out.print("vitória do "+this.desafiante.getnome());
                    this.desafiante.perderluta();
                    this.desafiado.ganharluta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer");
        }

    }
}
