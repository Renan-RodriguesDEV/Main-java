package main.orientacao_obj.poo_ii.javaswing.generics;

// operador diamante <> e o nome do tipo 
public class Generico<T> {
    T x;

    // costructor
    public Generico(T x) {
        this.x = x;
    }

    // metodo para retornar o valor do tipo genérico
    public T getValue() {
        return this.x;
    }
}
