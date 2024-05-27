package aulasmarcao.src.estruturadedados.estruturas.listas_encadeadas;

public class TestaLista {
    public static void main(String[] args) {
        Lista ls = new Lista();
        System.out.println(ls.getSize());
        ls.insereLast("Calabreso");
        ls.insereLast("Mussarelo");
        ls.insereLast("Mandioco");
        ls.insereLast("Caga Tronco");
        ls.insereLast("Piranho");
        ls.insereFirst("Delicio");
        System.out.println(ls.getSize());

        ls.display();
    }
}
