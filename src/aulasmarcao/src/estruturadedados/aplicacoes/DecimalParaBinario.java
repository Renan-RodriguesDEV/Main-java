package aplicacoes;

import javax.swing.JOptionPane;

public class DecimalParaBinario {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira N: "));
        long numeroBinario = 0;// n temos ainda entt 0
        int base = 1;//
        while (n > 0) {
            int utimoDigito = n % 2;
            numeroBinario += utimoDigito * base;
            base *= 10;
            n /= 2;
        }
        System.out.println("O número em Binario é: " + numeroBinario);
    }
}
