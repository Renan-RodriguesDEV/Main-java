package main.orientacao_obj.poo_ii.multiprogramacao;

public class CalculatorThread {
    private int soma;

    public synchronized int somarArray(int[] array) {
        soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            System.out.println("Em execuão: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
