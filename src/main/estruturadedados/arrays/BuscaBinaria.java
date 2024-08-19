package main.estruturadedados.arrays;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class BuscaBinaria {
    public static void main(String[] args) {
        int num[] = new int[20];
        // prenchendo o array com numeros aleatorios
        Random randomico = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (randomico.nextInt(50) * 1);
            System.out.print(num[i] + " ");
        }

        Arrays.sort(num);
        System.out.printf("\n" + Arrays.toString(num));
        System.out.println();
        String n = JOptionPane.showInputDialog("Insira o desejado");
        if (binarySearch(num, Integer.parseInt(n))) {
            System.out.println("tem");
        } else {
            System.out.println("nao tem");
        }
    }

    // metodo BuscaBinaria
    static boolean binarySearch(int[] array, int procurado) {
        Arrays.sort(array); // o array deve estar ordenado
        int esquerda = 0; // primeira posicao do array
        int direita = array.length - 1; // ultima posicao do array
        while (esquerda <= direita) {
            // (posicao do array) = ponto do meio
            int pontoMeio = (esquerda + direita) / 2; // ponto do meio recebe a esquerda + direita / por 2
            if (procurado == array[pontoMeio]) {
                return true;
            } else {
                if (procurado < array[pontoMeio]) { // se o procurado for menor q a atual posicao do pontoMeio
                    direita = pontoMeio - 1; // a direita vai para tras -1
                } else {
                    esquerda = pontoMeio + 1; // senao a esquerda anda +1
                }
            }
        }
        return false;
    }
}
