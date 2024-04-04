package aplicacoes;

public class primosNum {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int qtdPrimos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                if (nums[i] % 2 != 0) {
                    System.out.println(nums[i] + " e um numero primo");
                    qtdPrimos++;
                }
            }
        }
        System.out.println("O total de primos foi: " + qtdPrimos);

    }
}
