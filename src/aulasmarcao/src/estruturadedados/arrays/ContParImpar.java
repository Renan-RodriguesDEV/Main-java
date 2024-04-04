package arrays;

//package orientacaoObjetos.matematica.matematicosOutros;

public class ContParImpar {
    public static void main(String[] args) throws Exception {

        int qtdImpar = 0;
        int qtdPar = 0;
        int numeros[] = new int[10];
        for (int i = 1; i < 10; i++) {
            numeros[i] = i;
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                qtdImpar++;
            } else {
                qtdPar++;
            }
        }
        System.out.println("A quantidade de impares: " + qtdImpar);
        System.out.println("A quantidade de pares foi: " + qtdPar);
    }
}
