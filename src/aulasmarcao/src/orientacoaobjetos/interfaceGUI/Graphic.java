package aulasmarcao.src.orientacoaobjetos.interfaceGUI;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
    JButton btn;
    JTextField field1, field2;
    JLabel lb1, lb2;

    public Graphic() {
        JPanel p = new JPanel(new GridLayout(2, 2));
        btn = new JButton("Click");
        field1 = new JTextField("");
        field2 = new JTextField("");
        lb1 = new JLabel("Nome");
        lb2 = new JLabel("Telefone");
        p.add(lb1);
        p.add(lb2);
        p.add(field1);
        p.add(field2);
        add(p, "North");
        add(btn, "South");
        btn.addActionListener((e) -> {
            System.out.println("Evento");
        });
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Graphic();
    }
}
