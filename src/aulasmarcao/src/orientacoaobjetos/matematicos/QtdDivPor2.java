package matematicos;

import javax.swing.JOptionPane;

public class QtdDivPor2 {
    public static void main(String[] args) throws Exception {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor N:"));
        int divPorDois = 0;
        while (n >= 1) {
            if (n % 2 == 0) {
                divPorDois++;
            }
            n = n / 2;
        }
        System.out.println("Veses q pode ser dividido sao: " + divPorDois);
    }
}
