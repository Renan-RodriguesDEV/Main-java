package main.orientacao_obj.poo_ii.javaswing.generics;

public class IstanceX {
    public static void main(String[] args) {
        // estacia da classe generica
        // utilizando o integer dps do operador new
        Generico myGenerico = new Generico<Integer>(1);
        // utilizando o integer antes do operador new
        Generico<String> myGenerico2 = new Generico("None");
        // utilizando o integer antes e dps do operador new
        Generico<Character> myGenerico3 = new Generico<Character>('C');
        System.out.println(myGenerico.getValue());
        System.out.println(myGenerico2.getValue());
        System.out.println(myGenerico3.getValue());
    }
}
