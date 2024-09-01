package main.orientacao_obj.poo_ii.multiprogramacao;

public class MyThreadRunnable implements Runnable {

    String nome;
    int tempo;

    public MyThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        // Thread t = new Thread(this); // cria uma estacia de threads passando nossa
        // thread
        // t.start();
    }

    @Override
    public void run() {
        System.out.println("Iniciando thread " + nome);
        for (int i = 0; i < 5; i++) {
            System.out.println("Contador (" + i + ")");
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
