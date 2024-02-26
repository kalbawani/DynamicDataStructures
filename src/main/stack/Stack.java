package main.stack;

public class Stack {
    final private int CAPACITY;
    final private int[] stack;
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
        return top >= CAPACITY - 1;
    }

    public int getTop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack[top];
    }

    public void push(int element) {
        if (full()) {
            throw new RuntimeException("Stack is full!");
        }
        stack[++top] = element;
    }

    public int pop() {
        if (top < 0) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack[top--];
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