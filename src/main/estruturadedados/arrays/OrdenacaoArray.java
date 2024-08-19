package main.estruturadedados.arrays;

import javax.swing.JOptionPane;

public class OrdenacaoArray {
    public static void main(String[] args) {

        // invocando o metodo exibir
        exibir();
    }

    // metodo de preenchimento
    static int[] preencherArgs() {
        int ip = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do array: "));
        int array[] = new int[ip];
        // preenchendo o array
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posição [" + (i + 1) + "]"));
        }
        return array;
    }

    // metodo de ordenacao
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // metodo pra exibir
    static void exibir() {
        // recursao
        int[] array = preencherArgs();
        bubbleSort(array);

        System.out.println("Arrays em ordem descrescente: ");
        // foreach pra printar o array ordenado
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nArrays em ordem descrescente: ");
        // array descrescente Ordem
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

}
