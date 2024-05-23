package aulasmarcao.src.estruturadedados.arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[(int) ((Math.random() * 20) + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }
        // utilizando o classe array pra ordenacao
        Arrays.sort(array);
        System.out.println("Ordem crescente");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nOrdem descrescente");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
