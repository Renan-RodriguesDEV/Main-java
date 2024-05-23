package aulasmarcao.src.orientacoaobjetos.matematicos;

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {

        String ett = JOptionPane.showInputDialog("Digite um numero ");
        int num = Integer.parseInt(ett);
        int fat = 1;// inicia FAT com 1

        // ([i] -> [num] : até q [num] seja 1: decrementa -1)
        for (int i = num; i >= 1; i--) {

            // [fat] recebe ele [mesmo] X [i] -> 1 = 1 x [i]
            fat *= i;
            // fat = fat * i;
        }

        System.out.printf("O fatorial de: [%d] \nE: [%d]", num, fat);
    }
}
