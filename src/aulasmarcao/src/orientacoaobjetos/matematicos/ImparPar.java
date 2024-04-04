package matematicos;

import javax.swing.JOptionPane;

/**
 * ImparPar
 */
public class ImparPar {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        if (n % 2 > 0) {
            JOptionPane.showMessageDialog(null, n + " É Impar");
        } else if (n < 0) {
            JOptionPane.showMessageDialog(null, n + " É Negativo");
        } else if (n == 0) {
            JOptionPane.showMessageDialog(null, n + " É Zero");

        } else if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, n + " É Par");

        }

    }

}