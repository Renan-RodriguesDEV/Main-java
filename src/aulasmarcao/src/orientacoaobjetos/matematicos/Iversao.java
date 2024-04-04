package matematicos;

import javax.swing.*;

public class Iversao {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro: "));
        JOptionPane.showMessageDialog(null, " Resultado de [" + n + "] de trás pra frente: ", "IVERSAO",
                JOptionPane.ERROR_MESSAGE);
        // toda variavel q for utilizado para acumular ou auxiliar deve
        // ser inicializada
        String nTxt = "";
        // utilize o (do while) pq ele acontece ao menos umaa vez
        do {
            // o resto da divisao por 10 é o ultimo digito
            int utAlg = n % 10;

            // exibição do ultimo digito atual
            System.out.printf("%d", utAlg);

            // n -> n divido por 10
            n /= 10;// dps disso n -> o resultado de n / 10
            nTxt += utAlg;

        } while (n > 0);// enquanto n for maior que 0
        JOptionPane.showMessageDialog(null, nTxt);
    }
}
