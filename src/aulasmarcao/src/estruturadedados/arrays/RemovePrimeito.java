package arrays;

public class RemovePrimeito {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        num = removePrimeiro(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    static int[] removePrimeiro(int[] num) {
        int[] temp = new int[num.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = num[i + 1];
        }
        return temp;
    }

}
