package main.orientacao_obj.poo_ii.multiprogramacao;

public class TestaThreds {
    public static void main(String[] args) {
        MyThreds myThreds = new MyThreds("Thread 1", 900);
        MyThreds myThreds2 = new MyThreds("Thread 1", 600);
    }
}
