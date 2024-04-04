package strings;

import javax.swing.JOptionPane;

public class IsPalidromo {
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("insira uma palavra");

        if (isPalidromo(palavra)) {
            System.out.println(palavra + " Pode ser lido igualmente");
        } else {
            System.out.println(palavra + "Nao pode ser lido igualmente");

        }
    }

    static boolean isPalidromo(String palavra) {
        boolean vddFake = true;
        int ini = 0;
        int fim = palavra.length() - 1;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(ini) == (palavra.charAt(fim))) {
                vddFake = true;
            } else {
                return false;
            }
            ini++;
            fim--;
        }
        return vddFake;

    }

}
