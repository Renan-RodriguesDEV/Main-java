package estruturas.pilhas;

public class TestPlihado {
    public static void main(String[] args) {
        Pilhado pil = new Pilhado(5);
        pil.push(2);
        pil.push(4);
        pil.push(4);

        pil.printed();

        pil.pop();

        pil.printed();
    }
}
