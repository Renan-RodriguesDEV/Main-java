package main.orientacao_obj.poo_ii.multiprogramacao;

public class ThreadSincronizado implements Runnable {

    public int[] nums;
    public String nome;
    public CalculatorThread calc = new CalculatorThread();

    public ThreadSincronizado(int[] nums, String nome) {
        this.nums = nums;
        this.nome = nome;
        Thread t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Començando a somar...");

        int soma = calc.somarArray(this.nums);
        System.out.println("Soma de: " + soma);

        System.out.println("thread finalizada:" + this.nome);
    }
}
