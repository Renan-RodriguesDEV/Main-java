package arrays;

public class AcrecentaNaPos {
    public static void main(String[] args) {
        int numacresentado = 20;
        int posicaoacresentado = 1;
        int num[] = { 1, 2, 3, 4, 5 };

        if (posicaoacresentado <= num.length) {
            num = acresentaNaPos(num, posicaoacresentado, numacresentado);
            for (int i : num) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("posicao invalida");
        }

    }

    static int[] acresentaNaPos(int[] num, int posicaoacresentado, int numacresentado) {
        int[] temp = new int[num.length + 1];
        for (int i = 0; i < posicaoacresentado; i++) {
            temp[i] = num[i];
        }
        temp[posicaoacresentado] = numacresentado;
        for (int i = posicaoacresentado + 1; i < temp.length; i++) {
            temp[i] = num[i - 1];
        }
        return temp;
    }
}