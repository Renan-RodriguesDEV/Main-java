package arrays;

public class AcrecentaNoFim {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int acrecentado = 30;
        int[] novonum = acrecentaNoFim(nums, acrecentado);
        for (int i : novonum) {
            System.out.print(i + " ");
        }
    }

    static int[] acrecentaNoFim(int[] num, int acrecentado) {
        int novonum[] = new int[num.length + 1];
        novonum[novonum.length - 1] = acrecentado;// acrecenta na ultima posicao
        for (int i = 0; i < novonum.length - 1; i++) {
            novonum[i] = num[i];
        }
        return novonum;
    }
}
