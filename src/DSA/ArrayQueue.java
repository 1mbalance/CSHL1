package DSA;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue with a given capacity
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1; // Initialize rear to -1, indicating an empty queue
    }

    // Method to add an item to the end of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear % capacity] = item;
    }

    // Method to remove and return the item at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 if queue is empty
        }
        return queue[front++ % capacity];
    }

    // Method to return the item at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 if queue is empty
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (rear + 1 - front) == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (rear + 1 - front) == capacity;
    }
}