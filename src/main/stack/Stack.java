package main.stack;

public class Stack {
    final private int CAPACITY;
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        CAPACITY = capacity;
        top = -1;
        stack = new int[CAPACITY];
    }

    public boolean empty() {
        return top < 0;
    }

    public boolean full() {
        // implement me!
    }

    public int getTop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack[top];
    }

    public void push(int element) {
        // implement me!
    }

    public int pop() {
        // implement me!
    }

    public void print() {
        System.out.print("stack{");

        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + ", ");
        }

        if (!empty()) {
            System.out.print(stack[top]);
        }

        System.out.println("}");
    }
}
