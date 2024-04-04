package aplicacoes;

import javax.swing.JOptionPane;

public class Primos {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        int contPrimos = 0; // <- variaveis de acumulo comecam zeradas
        for (int cont = 1; cont <= num; cont++) {
            if (num % cont == 0) {
                contPrimos++;
            }
        }
        JOptionPane.showMessageDialog(null, contPrimos);
    }

}