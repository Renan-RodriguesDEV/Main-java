package aulasmarcao.src.orientacoaobjetos.strings;

import javax.swing.JOptionPane;

public class Valor {
    public static void main(String[] args) {
        String ntxt = JOptionPane.showInputDialog("Numero R$: ");
        String ntxt2 = JOptionPane.showInputDialog("Numero R$: ");
        System.out.printf("%.2f", valor(ntxt) * valor(ntxt2));
    }

    private static double valor(String ntxt) {
        ntxt = ntxt.replace(".", "").replace(",", ".");

        return Double.parseDouble(ntxt);
    }
}
