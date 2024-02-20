package main.queue;

public class Queue {
    final private int CAPACITY;
    private int size;

    // Declare queue, head and tail here!

    public Queue(int capacity) {
        // implement me!
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean full() {
        // implement me!
    }

    public int size() {
        return size;
    }

    public void enqueue(int element) {
        // implement me!
    }

    public int dequeue() {
        // implement me!
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
