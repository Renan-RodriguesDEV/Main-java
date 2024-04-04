package matematicos;

import javax.swing.JOptionPane;

public class NumTriangular {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
        int triangular = 1;
        int passo = 2;
        while (triangular < n) {
            triangular += passo;
            passo++;
        }
        if (triangular == n) {
            System.out.println(n + " é triângular");
        } else {
            System.out.println(n + " não é triângular");
        }
    }
}
