package aplicacoes;

import javax.swing.JOptionPane;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira N: "));
        int numeroDecimal = 0;
        int base = 1;
        while (n > 0) {
            int utimoDigito = n % 10;
            numeroDecimal += utimoDigito * base;
            base *= 2;
            n /= 10;
        }
        System.out.println("O número em decimal é: " + numeroDecimal);
    }
}
