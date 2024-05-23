package aulasmarcao.src.estruturadedados.estruturas.filas;

public class TestQueue {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<Integer>(8);

        System.out.println(queue.size);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        queue.print();
        queue.addCapacity();
        System.out.println(queue.size);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.print();

    }
}
