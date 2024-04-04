package matematicos;

import javax.swing.JOptionPane;

public class MegaSena {

    // principal vai rodar primeiro
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números ?"));
        int palpite[] = new int[n];
        sortear(palpite);
        classificar(palpite);
        exibir(palpite);
    }

    // sorteardor
    static void sortear(int[] num) {
        int aux[] = new int[60];
        for (int j = 0; j < aux.length; j++) {
            aux[j] = j + 1;
        }
        // o metodo embaralhar é chamado dentro de sortear
        embaralhar(aux);
        for (int j = 0; j < num.length; j++) {
            // é criado um for para guardar os valores do (aux)
            num[j] = aux[j];
        }
    }

    // embaralhador
    static void embaralhar(int num[]) {
        // criando o limitador/teto que n pd ser utrapassado
        int limited = num.length;
        for (int j = 1; j <= 1000; j++) {
            int p1 = (int) (Math.random() * limited);
            int p2 = (int) (Math.random() * limited);

            int aux = num[p1];
            num[p1] = num[p2];
            num[p2] = aux;
        }
    }

    // classificador para ordenar com buble sort
    static void classificar(int[] num) {
        for (int x = 0; x < num.length; x++) {
            for (int y = x + 1; y < num.length; y++) {
                if (num[x] > num[y]) {
                    int aux = num[x];
                    num[x] = num[y];
                    num[y] = aux;
                }
            }
        }
    }

    static void exibir(int[] num) {
        String txt = "";
        for (int i = 0; i < num.length; i++) {
            txt += num[i] + " ";
        }
        JOptionPane.showMessageDialog(null, txt);
    }
}
