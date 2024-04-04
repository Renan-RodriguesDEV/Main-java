package arrays;

import javax.swing.JOptionPane;

public class MetodoMin {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
            numeros[i] = n;
        }
        int menor = min(numeros);
        System.out.println("O menor elemento do array é: " + menor);
    }

    public static int min(int[] array) {

        int menor = array[0]; // Assume que o primeiro elemento é o menor

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }
}
