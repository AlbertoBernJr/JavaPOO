import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ScreenJFrame extends JFrame {
//[extends JFrame] = herdando o modificador de acesso da classe [JFRame]
// - não é mais necessário chamar o [JFrame] antes do [.set]/[.get]

    //-------metodo-------
    public ScreenJFrame() {
        //JFrame jFrame=new JFrame(); -> não precisa mais por causa do [extends JFrame]
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //- encerrará quando o sinal X for clicado
        //- se não for definido, ele ficara aberto em 2 plano

        setVisible(true); //modo padrão bem [false] = janela fica invisivel
        setTitle("Classe ScreenJFrame"); // Define o título da janela
        setSize(300, 150); // Define o tamanho da janela 400x150
        setLocationRelativeTo(null); // Define a localização da janela no meio da  tela

        setResizable(false); // Desabilita a possibilidade de alterar o tamanho da tela
        getContentPane().setBackground(Color.GRAY); // Define o fundo da tela com a cor cinza
    }
}
