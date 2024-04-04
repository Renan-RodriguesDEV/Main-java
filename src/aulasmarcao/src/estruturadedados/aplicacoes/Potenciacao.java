package aplicacoes;

import javax.swing.JOptionPane;

public class Potenciacao {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro para elevalo"));
        int potencia = 1;
        for (int i = 1; i < y; i++) {
            potencia *= x;
        }
        System.out.println("A potencia é :" + potencia);
    }
}
