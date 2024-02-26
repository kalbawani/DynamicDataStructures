package main.queue;

public class Queue {
    final private int CAPACITY;
    final private int[] queue;
    private int size;
    private int head;
    private int tail;

    public Queue(int capacity) {
        CAPACITY = capacity;
        size = 0;
        head = 0;
        tail = -1;
        queue = new int[CAPACITY];
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean full() {
        return size == CAPACITY;
    }

    public int size() {
        return size;
    }

    public void enqueue(int element) {
        if (full()) {
            throw new RuntimeException("Queue is full!");
        }

        if (tail == CAPACITY - 1) {
            tail = 0;
        } else {
            ++tail;
        }

        queue[tail] = element;
        ++size;
    }

    public int dequeue() {
        if (empty()) {
            throw new RuntimeException("Queue is empty!");
        }

        int element = queue[head];

        if (head == CAPACITY - 1) {
            head = 0;
        } else {
            ++head;
        }

        --size;
        return element;
    }

    public void print() {
        System.out.print("queue{");

        if (!empty()) {
            int counter = head;

            while (counter != tail) {
                System.out.print(queue[counter] + ", ");
                if (counter == CAPACITY - 1) {
                    counter = 0;
                } else {
                    ++counter;
                }
            }

            System.out.print(queue[tail]);
        }

        System.out.println("}");
    }
}
