package main.orientacao_obj.poo_ii.multiprogramacao;

public class TesteSincronizado {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ThreadSincronizado th1 = new ThreadSincronizado(arr, "Th1");
        ThreadSincronizado th2 = new ThreadSincronizado(arr, "Th2");
    }
}
