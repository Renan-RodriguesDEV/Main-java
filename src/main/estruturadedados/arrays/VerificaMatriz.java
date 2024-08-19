package main.estruturadedados.arrays;

public class VerificaMatriz {


    public static void main(String[] args) {
        System.out.println("Hello word");
        int mat[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 },
                {9,10,11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24 } };
        isReapet(mat);
    }

    static void isReapet(int[][] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if (arr[i][j] == arr[j][j2]) {
                        System.out.println("Reapet");
                    }
                }
            }
        }
    }

}
