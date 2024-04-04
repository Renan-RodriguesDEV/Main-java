package arrays;

public class ArraysIguais {
    public static void main(String[] args) {
        int[] array_1 = { 1, 2, 2, 4, 5, 6, 7, 8 };
        int[] array_2 = { 1, 2, 2, 4, 5, 6, 7, 8 };
        if (isIgual(array_1, array_2)) {
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }
    }

    static boolean isIgual(int[] array_1, int[] array_2) {
        // acumulativo comeca em falso, pois nao sabemos se sao iguais ja de inicio
        boolean acumulativo = false;
        // se o tamanho dos arrays forem iguais ele entra no for caso contraio ele
        // retorna o acumulativo q por enquanto e falso
        if (array_1.length == array_2.length) {
            for (int i = 0; i < array_2.length; i++) {
                // se os arrays na msm posicao forem iguais o acumulativo vira verdadeiro
                if (array_1[i] == array_2[i]) {
                    acumulativo = true;
                } else {
                    // se os arrays na msm posicao forem diferentes o retornaremos false e o metodo
                    // se encerrara retornando false
                    return false;
                }
            }
        }
        return acumulativo;
    }
}
