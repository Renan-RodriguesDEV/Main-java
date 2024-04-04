package matematicos;

import java.util.Arrays;

public class MediaModaMediana {
    public static void main(String[] args) {

        int[] lista = { 8, 2, 3, 4, 9, 6, 3 };
        int somaMedia = 0;
        int tamanhoLista = lista.length;
        for (int i = 0; i < tamanhoLista; i++) {
            somaMedia += lista[i];
        }
        double media = somaMedia / lista.length;
        System.out.println("Soma dos valores: " + somaMedia);
        System.out.println("Tamanho: " + tamanhoLista);
        System.out.println("Media: " + media);

        int mediana;
        // caso seja par
        if (tamanhoLista % 2 == 0) {
            Arrays.sort(lista);// ordenando a lista
            int auxiliar = tamanhoLista / 2;
            // A mediana -> lista[meio] + lista[meio - 1] / 2
            mediana = (lista[auxiliar] + lista[auxiliar - 1]) / 2;
            System.out.println("Mediana: " + mediana);
        }
        // se for impar
        else {
            int auxiliar = tamanhoLista / 2;
            mediana = lista[auxiliar];
            System.out.println("Mediana: " + mediana);
        }

        int moda = lista[0];
        int contagem = 1;
        int contMaxima = 1;
        Arrays.sort(lista);
        // for começando do 2 elemento do array [1] -> 2 elemento
        for (int i = 1; i < tamanhoLista; i++) {
            // se a posiçao atual == a posiçao anterior => [atual - 1]
            if (lista[i] == lista[i - 1]) {
                contagem++;
            } else {
                contagem = 1;
            }

            if (contagem > contMaxima) {
                contMaxima = contagem;
                moda = lista[i];
            }
            System.out.println("Moda: " + moda);

        }

    }

}
