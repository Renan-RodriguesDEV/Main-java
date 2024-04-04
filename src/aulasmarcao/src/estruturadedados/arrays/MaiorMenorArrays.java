package arrays;

import javax.swing.JOptionPane;

/**
 * Teste
 */
public class MaiorMenorArrays {
    public static void main(String[] args) {
        int n[] = new int[5];
        int tam = n.length;
        for (int i = 0; i < tam; i++) {

            n[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um valor"));
        }
        int maior = n[0];
        int menor = n[0];
        for (int i = 0; i < tam; i++) {
            if (n[i] >= maior) {
                maior = n[i];
            }
            if (n[i] <= menor) {
                menor = n[i];
            }
        }
        System.out.println("maior: " + maior + " menor: " + menor);
    }

}