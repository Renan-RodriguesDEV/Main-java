package arrays;

public class InverteOrdemArray {
    public static void main(String[] args) {
        int nums[] = { 5, 2, 10, 4, 1 };
        inverter(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    static void inverter(int[] array) {
        int inicio = 0;// inicializa comm zero para emtrar no loop
        int fim = array.length - 1;// ultima posicao do array

        // enquanto o inicio do array for maior que o fim dele (array ainda está
        // ordenado)
        while (inicio < fim) {
            int laranja = array[inicio];
            array[inicio] = array[fim];
            array[fim] = laranja;
            inicio++; // inicio ganha um
            fim--; // fim perde um
        }
    }
}
