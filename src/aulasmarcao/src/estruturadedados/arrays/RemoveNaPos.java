package arrays;

public class RemoveNaPos {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int posicao = 2;
        array = removeNaPosicao(array, posicao);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static int[] removeNaPosicao(int[] array, int posicao) {
        int[] aux = new int[array.length - 1];
        for (int i = 0; i < posicao; i++) {
            aux[i] = array[i];
        }
        for (int i = posicao; i < aux.length; i++) {
            aux[i] = array[i + 1];
        }
        return aux;
    }
}
