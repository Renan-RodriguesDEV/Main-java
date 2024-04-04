package aplicacoes;

import javax.swing.JOptionPane;

public class UsandoFlag {
    // ENCONTRANDO PRIMO COM A FLAG( UMA VARIÁVEL BOOLEANA COMO SINALIZAÇÃO )
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero Patrão : "));

        boolean primo = true;
        if (n == 1) {
            primo = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % 2 == 0) {
                    primo = false;
                    break; // interrompe o loop
                }
            }
            if (primo) {
                JOptionPane.showMessageDialog(null, "É primo");
            } else {
                JOptionPane.showMessageDialog(null, "Não é primo");
            }
            System.out.println("Mais a raiz de, " + n + " é " + Math.sqrt(n));
        }

    }
}
