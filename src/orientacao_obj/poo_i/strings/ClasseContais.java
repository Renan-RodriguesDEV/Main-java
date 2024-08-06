package orientacao_obj.poo_i.strings;

import javax.swing.JOptionPane;

public class ClasseContais {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("insira seu email");
        if (email.contains("@gmail.com") || email.contains("@email.com")) {
            System.out.println("bem vindo: " + email);
        } else {
            System.out.println("email invalido");
        }
    }
}
