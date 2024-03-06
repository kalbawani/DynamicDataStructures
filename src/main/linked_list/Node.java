package main.linked_list;

public class Node <T> {
    public T key;
    Node prev;
    Node next;

    public Node(T key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
