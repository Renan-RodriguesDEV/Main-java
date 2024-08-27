package main.orientacao_obj.poo_ii.Colecoes;

import java.util.*;

public class CollectionsInterface {
    public static void main(String[] args) {
        Collection<Integer> array = new ArrayList<>(10);
        array.add(1);
        array.add(10);
        array.add(100);
        array.add(13);
        array.add(133);
        array.add(125);
        removeImpares(array);
        System.out.println("pos tirar impares: " + array);
    }

    static void removeImpares(Collection<Integer> dados) {
        // intancia um iterador a nossa lista
        Iterator<Integer> iterador = dados.iterator();

        // enquanto o hasNext() == true -> ele itera pq Há um Proximo
        while (iterador.hasNext()) {
            // next() -> retorna o proximo elemento e avança o iterador
            int temp = iterador.next();
            if (temp % 2 != 0) {
                System.out.println(temp + " é impar");
                // remove() -> remove o elemento corrente do iterador do nosso array
                iterador.remove();
            }
        }
    }
}
