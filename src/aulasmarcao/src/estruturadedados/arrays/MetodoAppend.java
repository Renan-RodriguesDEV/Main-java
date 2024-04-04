package arrays;

public class MetodoAppend {
    public static void main(String[] args) {
        int[] dados = { 10, 20, 30 };
        int numacresentado = 100;
        int[] dadosNovos = append(dados, numacresentado);
        for (int i : dadosNovos) {
            System.out.println(i);
        }
    }

    static int[] append(int[] dados, int acresentado) {
        int dadosNovos[] = new int[dados.length + 1];// o tamanho do outro array + 1

        for (int i = 0; i < dados.length; i++) {
            dadosNovos[i] = dados[i];
        }
        dadosNovos[dados.length] = acresentado;
        return dadosNovos;
    }
}
