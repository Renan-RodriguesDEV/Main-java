package aulasmarcao.src.orientacoaobjetos.interfaceGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaQ extends JFrame {
    JButton antes, depois;
    JLabel lbNome, lbIdade, tittle;
    JTextField txtNome, txtIdade;

    public JanelaQ() {
        lbIdade = new JLabel("Idade");
        lbNome = new JLabel("Nome");
        tittle = new JLabel("Titulo");
        antes = new JButton("Antes");
        depois = new JButton("Depois");
        txtIdade = new JTextField("Idade");
        txtNome = new JTextField("Nome");

        add(tittle, "North");
        JPanel painel = new JPanel(new GridLayout(3, 2));
        painel.add(lbIdade);
        painel.add(lbNome);
        painel.add(txtIdade);
        painel.add(txtNome);
        add(painel, "Center");

        JPanel butPanel = new JPanel();
        butPanel.add(antes);
        butPanel.add(depois);
        add(butPanel, "South");

        // eventos utilizando o metodo padrao
        antes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Cricou");
            }

        });
        depois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Cricou");
            }

        });

        // eventos utilizando lambda (funcoes anonimas)
        antes.addActionListener((e) -> {
            antes.setBackground(new Color(255, 255, 255));
        });
        depois.addActionListener((e) -> {
            depois.setBackground(new Color(255, 255, 255));
        });

        setTitle("JanelaQ");
        pack();// definine um tamanho padrao
        setSize(500, 180);
        setLocationRelativeTo(null);// Centraliza a janela na tela
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JanelaQ();
    }
}
