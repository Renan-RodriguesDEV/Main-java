package matrizes;

public class OrdenacoaMat {
    public static void main(String[] args) {
        int rows = 2;
        int coluns = 4;
        int[][] matriz = new int[rows][coluns];
        System.out.println("matriz normal: ");
        fill_matriz(matriz, rows, coluns);
        System.out.println("matriz em ordem: ");
        ordena(matriz);
        exibir(matriz);
    }

    static void fill_matriz(int[][] matriz, int rows, int coluns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coluns; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        exibir(matriz);
    }

    static void ordena(int[][] matriz) {
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] > matriz[linha][coluna + 1]) {
                    int aux = matriz[linha][coluna];
                    matriz[linha][coluna] = matriz[linha][coluna + 1];
                    matriz[linha][coluna + 1] = aux;

        }
    }

    static void exibir(int[][] matriz) {
        for (int x = 0; x <= 1; x++) {// controla linha
            for (int y = 0; y <= 2; y++) {// controla coluna
                System.out.print(matriz[x][y]);
            }
            System.out.println();
        }
    }
}
