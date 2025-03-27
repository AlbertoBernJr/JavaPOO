import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JTextField");
        JTextField campoTexto = new JTextField(20); // 20 = largura aproximada em caracteres

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new JLabel("Digite seu nome:")); 
        //criando um conteudo [JLabel] na janela [JFrame]
      
        frame.add(campoTexto); //adicionando o conteudo de [JTextField] à janela [JFrame]
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        campoTexto.setText("Digite aqui");
    }
}
