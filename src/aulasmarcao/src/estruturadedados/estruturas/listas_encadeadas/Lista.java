package aulasmarcao.src.estruturadedados.estruturas.listas_encadeadas;

public class Lista {
    private Nos head;
    private Nos tail;
    private int size;

    public int getSize() {
        return size;
    }

    void insereFirst(String inserido) {
        Nos novo = new Nos(inserido);
        if (size == 0) {
            head = tail = novo;
            size++;
        } else {
            novo.setProximo(head);
            head.setAnterior(novo);
            head = novo;
            size++;
        }
    }

    void insereLast(String inserido) {
        Nos novo = new Nos(inserido);
        if (size == 0) {
            head = tail = novo;
            size++;
        } else {
            novo.setAnterior(tail);
            tail.setProximo(novo);
            tail = novo;
            size++;
        }
    }

    void removeLast() {
        if (head == null) {
            if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Nos auxiliar = head.getProximo();
                auxiliar.setAnterior(null);
                head.setProximo(null);
                head = auxiliar;
                size--;
            }
        }
    }

    void removeFirst() {
        if (head != null) {
            if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Nos auxiliar = tail.getAnterior();
                auxiliar.setProximo(null);
                tail.setAnterior(null);
                tail = auxiliar;
                size--;
            }
        }
    }

    boolean contains(String buscado) {
        Nos no = head;
        while (head != null) {
            if (buscado.equals(no.getValor())) {
                return true;
            }
            no = no.getProximo();
        }
        return false;
    }

    String searchList(String buscado) {
        Nos no = head;
        while (head != null) {
            if (no.getValor().equals(buscado)) {
                return no.getValor();
            }
            no = no.getProximo();
        }
        return null;
    }

    void display() {
        Nos exibido = head;
        while (exibido != null) {
            System.out.println(exibido.getValor());
            exibido = exibido.getProximo();
        }
    }

}
