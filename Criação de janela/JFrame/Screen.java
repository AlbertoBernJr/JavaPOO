import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Screen {
    //-------metodo-------
    public Screen(){
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //- encerrará quando o sinal X for clicado
        //- se não for definido, ele ficara aberto em 2 plano

        jFrame.setVisible(true); //modo padrão bem [false] = janela fica invisivel
        jFrame.setTitle("Classe Screen"); // Define o título da janela
        jFrame.setSize(300, 150); // Define o tamanho da janela 400x150
        jFrame.setLocationRelativeTo(null); // Define a localização da janela no meio da  tela

        jFrame.setResizable(false); // Desabilita a possibilidade de alterar o tamanho da tela
        jFrame.getContentPane().setBackground(Color.green); // Define o fundo da tela com a cor cinza
    }
}


