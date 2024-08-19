package main.estruturadedados.estruturas.pilhas;

public class Pilhado {
    private int dados[];
    private int elementos;
    private int topo;

    public Pilhado(int capacidade) {
        dados = new int[capacidade];
        topo = 0;
        elementos = 0;
    }

    public boolean push(int inserido) {
        if (!(dados.length <= 0)) {
            dados[topo] = inserido;
            elementos++;
            topo++;
            return true;
        }
        return false;
    }

    public int pop() {
        if (elementos != 0) {
            int removido = this.dados[topo - 1];
            elementos--;
            topo--;
            return removido;
        }
        return 0;
    }

    public void printed() {
        for (int i = 0; i < topo; i++) {
            System.out.print(dados[i]);
        }
        System.out.println();
    }
}
