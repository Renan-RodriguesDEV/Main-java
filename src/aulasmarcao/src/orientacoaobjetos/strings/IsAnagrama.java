package strings;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class IsAnagrama {
    public static void main(String[] args) {
        String p = JOptionPane.showInputDialog("Insira uma palavra");
        String p2 = JOptionPane.showInputDialog("Insira uma palavra");
        if (isAnagrama(p, p2)) {
            System.out.println("Sao");
        } else {
            System.out.println("Nao sao");
        }
    }

    static boolean isAnagrama(String p, String p2) {
        char[] ch1 = p.toCharArray();
        char[] ch2 = p2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
