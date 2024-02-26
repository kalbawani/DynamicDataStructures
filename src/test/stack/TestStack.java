package test.stack;

import main.stack.*;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.print();
        stack.pop();
        stack.push(88);
        stack.push(33);
        stack.push(7);
        stack.push(53);
        stack.push(9);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
