package matematicos;

import javax.swing.JOptionPane;

public class BubleSort {
    public static void main(String[] args) {
        String nTxt = JOptionPane.showInputDialog("Numero 1: ");
        int N1 = Integer.parseInt(nTxt);
        nTxt = JOptionPane.showInputDialog("Numero 2: ");
        int N2 = Integer.parseInt(nTxt);
        nTxt = JOptionPane.showInputDialog("Numero 3: ");
        int N3 = Integer.parseInt(nTxt);
        int temp;

        if (N1 > N2) {
            temp = N1;
            N1 = N2;
            N2 = temp;
        }
        if (N2 > N3) {
            temp = N2;
            N2 = N3;
            N3 = temp;
        }
        if (N1 > N2) {
            temp = N1;
            N1 = N2;
            N2 = temp;
        }
        System.out.printf("Ordem correta e: %d, %d, %d", N1, N2, N3);
    }
}
