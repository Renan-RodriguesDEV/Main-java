package main.orientacao_obj.poo_i.matematicos;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    static int fibo(int n) {
        int a = 1, b = 1, c = 0;
        // fibonacci = 1 + 1 = 2 -> 1 + 2 = 3 -> 3 + 2 = 5 ...
        for (int i = a + b; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
