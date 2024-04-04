package aplicacoes;

import javax.swing.JOptionPane;

/**
 * TrianguloRetangulo
 */
public class TrianguloRetangulo {

    public static void main(String[] args) {

        int l1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o l1: "));
        int l2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o l2: "));
        int l3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o l3: "));

        if (l1 + l2 > l3 || l2 + l3 > l1 || l3 + l1 > l2) {

            System.out.println("Forma um triangulo retangulo");
        } else {
            System.out.println("nao e retangular");
        }
    }

}