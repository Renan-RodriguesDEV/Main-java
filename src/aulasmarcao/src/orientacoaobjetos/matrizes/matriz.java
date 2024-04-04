package matrizes;

public class matriz {
    public static void main(String[] args) {
        // qtde de linhas
        int rows = 3;
        // qtde de colunas
        int columns = 6;

        int matriz[][] = new int[rows][columns];

        // preenchendo a matriz onde row é uma linha e coluna apenas um coluna
        for (int row = 0; row < rows; row++) {
            for (int coluna = 0; coluna < columns; coluna++) {
                //preenchendo com um valor random
                double nrd = (int) (1 + Math.random() * 100);
                matriz[row][coluna] = (int) (Math.sqrt(nrd + coluna * row));
            }
        }

        // exibição
        for (int row = 0; row < rows; row++) {
            for (int coluna = 0; coluna < columns; coluna++) {
                System.out.print(matriz[row][coluna] + " ");
            }
            // pula uma linha a cada iteraçao do laço com row
            System.out.println();
        }

    }
}
