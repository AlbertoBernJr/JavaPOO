import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Personalizado"); //titulo da janela
        JLabel label = new JLabel("Texto Personalizado"); //conteudo da janela

        // Altera a fonte, cor e alinhamento
        label.setFont(new Font("Arial", Font.BOLD, 18)); //Fonte Arial, negrito, tamanho 18
        label.setForeground(Color.BLUE); //Cor do texto: azul
        label.setHorizontalAlignment(SwingConstants.CENTER); //Alinhamento centralizado

        frame.add(label); //adicionar um componente gráfico ou conteudo [JLabel] à janela [JFrame]
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
