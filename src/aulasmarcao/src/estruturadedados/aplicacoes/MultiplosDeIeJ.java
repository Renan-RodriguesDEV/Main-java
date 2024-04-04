package aplicacoes;

import java.util.Scanner;

public class MultiplosDeIeJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira N:");
        int n = sc.nextInt();
        System.out.println("Insira I:");
        int i = sc.nextInt();
        System.out.println("Insira J:");
        int j = sc.nextInt();
        int num = 0;
        int exibidos = 0;
        sc.close();
        // enqunato os numeros exibidos forem menor que n
        while (exibidos <= n) {
            // se num for divisivel por i e j
            if (num % i == 0 || num % j == 0) {
                // exibir num
                System.out.println(num);
                // incrementar exibidos case o if seja vdd
                exibidos++;
            }
            // mesmo se n cair no if num soma 1
            num++;
        }
    }
}