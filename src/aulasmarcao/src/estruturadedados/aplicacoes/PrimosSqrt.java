package aplicacoes;

import javax.swing.JOptionPane;

public class PrimosSqrt {
    // ENCONTRANDO PRIMO COM MATH.SQRT() RAIZ²

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero Patrão : "));

        if (n == 1) {
            JOptionPane.showMessageDialog(null, "Não é prima");
            return; // <- o return nao deixa o proximo comando ser executado caso seu if seja
                    // verdaadeiro
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                JOptionPane.showMessageDialog(null, "Não é prima");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "É prima");
    }
}
