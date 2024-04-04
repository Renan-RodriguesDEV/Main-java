package arrays;

public class AcrecentaNoInicio {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int acrecentado = 30;
        int[] novonum = acrecentaNoInicio(nums, acrecentado);
        for (int i : novonum) {
            System.out.print(i + " ");
        }
    }

    static int[] acrecentaNoInicio(int[] num, int acrecentado) {
        int novonum[] = new int[num.length + 1];
        novonum[0] = acrecentado;
        for (int i = 1; i < novonum.length; i++) {
            novonum[i] = num[i - 1];
        }
        return novonum;
    }
}
