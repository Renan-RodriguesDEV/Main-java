package arrays;

public class RemoveNoFim {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        num = removeNoFim(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    static int[] removeNoFim(int[] num) {
        int[] temp = new int[num.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = num[i];
        }
        return temp;
    }

}
