package main.estruturadedados.estruturas.filas;

import java.util.Arrays;

public class Queue<Type> {
    int first, last, qtde, size;
    Type[] elements; // Type é o generics q utilizei na assinatura da classe

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        elements = (Type[]) new Object[size];
        first = last = qtde = 0;
        this.size = elements.length;
    }

    Boolean enqueue(Type dado){ // metodo de enfileirar
        if (size == 0 || qtde == size) {
            return false;

        }
        // add ao fim da fila (enqueue)
        elements[last] = dado;
        last = (last + 1) % size;// fim = fim + 1 e o resto da div pelo seu tamanho
        qtde++;
        return true;
    }

    Type dequeue(){ // metodo de desinfileirar
        if (qtde == size) { // se tiver 0 n tem da onde tirar
            return null;
        }
        // retira do inicio da fila (dequeue)
        Type dado = elements[first];
        first = (first + 1) % size; // inicio = inicio + 1 e o resto da div pelo seu tamanho
        qtde--;
        return dado;

    }

    Type[] addCapacity() {
        Type[] newQueue = Arrays.copyOf(elements, size * 2);
        elements = newQueue;
        size = newQueue.length;
        first = 0;// zeramos o primeiro
        return elements;
    }

    void print() {
        System.out.println("elementos: ");
        for (int i = 1; i <= qtde; i++) {
            System.out.print(elements[first] + " ");
            first = (first + 1) % size;
        }
        System.out.println();
    }
}