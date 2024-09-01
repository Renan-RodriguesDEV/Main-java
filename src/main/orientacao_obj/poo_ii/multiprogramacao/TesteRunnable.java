package main.orientacao_obj.poo_ii.multiprogramacao;

public class TesteRunnable {

    public static void main(String[] args) {
        int tempo = 100;
        MyThreadRunnable th1 = new MyThreadRunnable("Thread #1", 500);
        MyThreadRunnable th2 = new MyThreadRunnable("Thread #2", 600);
        MyThreadRunnable th3 = new MyThreadRunnable("Thread #3", 600);

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);

        t1.start();
        t2.start();
        t3.start();

        // while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
        // // enquanto alguma thread estiver rodando (isAlive)
        // try {
        // Thread.sleep(100); // espere
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }

        try {
            // prioridade de execução, recebe uma constabte ou int
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);

            // espera para exibir finalizado, msm coisa q o while faz
            t1.join(tempo);
            t2.join(tempo);
            t3.join(tempo);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Fim do Programa!!!");
    }
}
