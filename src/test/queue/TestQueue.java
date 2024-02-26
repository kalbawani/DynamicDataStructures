package test.queue;

import main.queue.*;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.print();
        queue.enqueue(88);
        queue.enqueue(33);
        queue.enqueue(7);
        queue.enqueue(53);
        queue.enqueue(9);
        queue.enqueue(9);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.dequeue();
    }
}
