package matematicos;

import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));
        int a = 1;// os primeiros 2 numeros são 1
        int b = 1;
        int c = 0; // inicializa com 0 pra n haver conflito c o java, mas dps recebe a + b no loop
        for (int i = 3; i < n; i++) {
            // o i começa em 3 pq ja temos os 2 primeiros numeros de Fibonacci 1 & 1
            c = a + b; // c recebe a + b
            a = b; // a recebe b
            b = c; // b recebe c
        }
        System.out.println(c);
    }
}