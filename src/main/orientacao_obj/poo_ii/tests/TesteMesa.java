package main.orientacao_obj.poo_ii.tests;

public class TesteMesa {
    public static void main(String[] args) {
        teste_dois();
    }

    static void teste_um() {
        int ac = 0;
        for (int x = 0; x <= 20; x += 3) {
            for (int y = 1; y <= 2; y++) {
                if (x % 2 == 0) {
                    ac += y;
                    System.out.println(x + " é divisivel por 2");
                }
                System.out.println(" AC: " + ac + " X: " + x + " Y: " + y);
            }
        }
        System.out.println("Resultado final: " + ac);

    }

    static void teste_dois() {
        int ac = 100;
        for (int i = 0; i <= 60; i += 7) {
            if (i % 2 == 0) {
                ac -= i;

            }
            System.out.println("AC: " + ac + " X: " + i);

        }
        System.out.println("Resultado final: " + ac);
    }
}
