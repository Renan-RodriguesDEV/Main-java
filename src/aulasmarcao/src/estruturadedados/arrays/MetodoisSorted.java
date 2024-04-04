package arrays;

public class MetodoisSorted {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        if (isSorted(nums)) {
            System.out.println("Está ordenado");
        } else {
            System.out.println("Está ordenado");
        }
    }

    static boolean isSorted(int[] ordenados) {
        for (int i = 0; i < ordenados.length - 1; i++) {
            if (ordenados[i] >= ordenados[i + 1]) {
                return false;

            }
        }
        return true;
    }
}
