package strings;

import javax.swing.JOptionPane;

public class IsEmail2 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Email para login: ");
        isEmail(email);
        exibir(email);
    }

    static boolean isEmail(String email) {
        if (email.contains("@") && email.contains("mail.com")) {
            if (email.indexOf("@") > 5) {
                return true;
            }

        }
        return false;
    }

    static void exibir(String email) {
        if (isEmail(email)) {
            System.out.println("Bem vindo de volta " + email);
        } else {
            System.out.println("O email: (" + email + ") esta incorreto");
        }
    }
}
