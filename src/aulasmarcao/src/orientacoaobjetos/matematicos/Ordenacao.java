package matematicos;

import javax.swing.JOptionPane;

//este algoritimo ordena e descobre o maior,meio e menor 
public class Ordenacao {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("DIGITE O 1° NUMERO: ");
        int numOne = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("DIGITE O 2° NUMERO: ");
        int numTwo = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("DIGITE O 3° NUMERO: ");
        int numTry = Integer.parseInt(input);

        int maior;
        int meio;
        int menor;

        if (numOne > numTwo && numOne > numTry) {
            maior = numOne;
            if (numTwo > numTry) {
                meio = numTwo;
                menor = numTry;
            } else {
                meio = numTry;
                menor = numTwo;
            }
        } else if (numTwo > numOne && numTwo > numTry) {
            maior = numTwo;
            if (numOne > numTry) {
                meio = numOne;
                menor = numTry;
            } else {
                meio = numTry;
                menor = numOne;
            }
        } else {
            maior = numTry;
            if (numTwo > numOne) {
                meio = numTwo;
                menor = numOne;
            } else {
                meio = numOne;
                menor = numTwo;
            }
        }
        JOptionPane.showMessageDialog(null, "OS NUMEROS ORDENADOS SÃO: " + maior + " - " + meio + " - " + menor);
        JOptionPane.showMessageDialog(null, "O MAIOR É: " + maior);
    }
}
