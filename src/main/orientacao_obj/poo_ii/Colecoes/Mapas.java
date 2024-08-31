package main.orientacao_obj.poo_ii.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        // Map - TreeMap - HashMap
        Map<Integer, String> myMap = new TreeMap<>();
        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] valores = { "a", "b", "c", "d", "e", "g", "h", "i", "j" };
        for (int i = 0; i < valores.length; i++) {
            myMap.put(keys[i], valores[i]); // add um elemento

        }
        System.out.println(myMap.keySet()); // mostra as keys do mapa
        System.out.println(myMap.get(3)); // pega um elemento pelo indice da key
        myMap.remove(3);
        myMap.remove(0, "a");
        System.out.println(myMap.entrySet());
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
    }
}
