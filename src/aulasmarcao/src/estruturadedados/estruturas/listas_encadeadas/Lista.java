package aulasmarcao.src.estruturadedados.estruturas.listas_encadeadas;

public class Lista {
    private Nos head;
    private Nos tail;
    private int size;

    public Nos getHead() {
        return head;
    }

    public void setHead(Nos head) {
        this.head = head;
    }

    public Nos getTail() {
        return tail;
    }

    public void setTail(Nos tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    void insereFirst(String inserido) {
        Nos novo = new Nos(inserido);
        if (!(size == 0)) {
            head.setAnterior(novo);
            novo.setProximo(head);
            head = novo;
            size++;
        } else if (head == null || size == 0) {
            head = tail = novo;
            size++;
        }
    }

    void insereLast(String inserido) {
        Nos novo = new Nos(inserido);
        if (!(size == 0)) {
            tail.setProximo(novo);
            novo.setAnterior(tail);
            tail = novo;
            size++;
        } else if (head == null || size == 0) {
            head = tail = novo;
            size++;
        }
    }

    void removeLast() {
        if (size == 0) {
            head = tail = null;
            size--;
        } else {
            Nos temp = tail.getAnterior();
            tail.setAnterior(null);
            temp.setProximo(null);
            tail = temp;
            size--;
        }
    }

    void removeFirst() {
        if (size == 0) {
            head = tail = null;
            size--;
        } else {
            Nos temp = head.getProximo();
            head.setProximo(null);
            temp.setAnterior(null);
            head = temp;
            size--;
        }
    }

    boolean contains(String buscado) {
        Nos newNo = head;
        while (newNo != null) {
            if (newNo.getValor().equals(buscado)) {
                return true;
            }
            newNo = newNo.getProximo();
        }
        return false;
    }

    String searchList(String buscado) {
        Nos newNo = head;
        while (newNo != null) {
            if (newNo.getValor().equals(buscado)) {
                return newNo.getValor();
            }
            newNo = newNo.getProximo();
        }
        return null;
    }

    void display() {
        Nos newNo = head;
        while (newNo != null) {
            System.out.println(newNo.getValor());
            newNo = newNo.getProximo();
        }
    }

}
