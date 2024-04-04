package strings;

import javax.swing.JOptionPane;

public class Valor {
    public static void main(String[] args) {
        String ntxt = JOptionPane.showInputDialog("Numero R$: ");
        System.out.printf("%.2f", valor(ntxt));
    }

    private static double valor(String ntxt) {
        double nDouble = Double.parseDouble(ntxt);
        return nDouble;
    }
}
