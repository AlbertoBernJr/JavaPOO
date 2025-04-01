import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPasswordField campoSenha = new JPasswordField(20);
        JButton botao = new JButton("Ver Senha");//texto do botão

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] senha = campoSenha.getPassword();
                JOptionPane.showMessageDialog(frame, "Senha digitada: " + new String(senha));
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new JLabel("Senha:"));
        frame.add(campoSenha);
        frame.add(botao);
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
