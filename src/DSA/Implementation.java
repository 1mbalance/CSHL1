package DSA;

public class Implementation {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element of the queue: " + queue.peek());

        queue.dequeue();

        System.out.println("Front element of the queue after dequeue operation: " + queue.peek());

    }
}
