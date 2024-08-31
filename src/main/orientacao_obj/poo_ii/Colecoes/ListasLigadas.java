package main.orientacao_obj.poo_ii.Colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListasLigadas {
    public static void main(String[] args) {
        // List - LinkedList - ArrayList - Queue - Stack
        LinkedList<Integer>lk = new LinkedList<>();
        LinkedList lkSemTipo = new LinkedList<>(); // lista sem tipo predefinido entra qlqr coisa
        lk.add(1);
        lk.add(12);
        lk.add(1);
        lk.add(12);
        lk.add(14);
        lk.add(15);
        lk.offer(12); // add final
        lk.offerFirst(0); // add inicio
        System.out.println(lk.toString());

        lkSemTipo.add("Str");
        lkSemTipo.add(1);
        lkSemTipo.add("Char");
        lkSemTipo.add(2.5);
        System.out.println(lkSemTipo.toString());

        System.out.println(lk.poll()); // remove no inicio
    }
}
