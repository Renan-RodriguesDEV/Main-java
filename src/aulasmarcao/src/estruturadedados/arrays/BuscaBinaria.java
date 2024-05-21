package arrays;

import java.util.Arrays;
import java.util.Random;

public class BuscaBinaria {
    public static void main(String[] args) {
        int num[] = new int[20];
        Random randomico = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (randomico.nextInt(100) * 1);
            System.out.print(num[i] + " ");
        }
        System.out.println();

        boolean flag = binarySearch(num, 6);
        if (flag) {
            System.out.println("tem");
        } else {
            System.out.println("nao tem");
        }
    }

    static boolean binarySearch(int[] array, int procurado) {
        Arrays.sort(array);
        int esquerda = 0;
        int direita = array.length;
        while (esquerda <= direita) {
            int pm = (esquerda + direita) / 2;
            if (procurado == array[pm]) {
                return true;
            } else {
                if (procurado < array[pm]) {
                    direita = pm - 1;
                } else {
                    esquerda = pm + 1;
                }
            }
        }
        return false;
    }
}
