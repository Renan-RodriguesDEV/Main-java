package main.orientacao_obj.poo_ii.multiprogramacao;

public class MyThreds extends Thread {
    public String nome;
    public int tempo;

    public MyThreds(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); // da inicio a thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Contador está em: " + i);
            try {
                this.sleep(tempo); // tempo de espera a cada execução em ms
            } catch (InterruptedException e) {
                System.out.println("Erro");
            }
        }
        System.out.println("Fim da thread " + nome);
    }

}
