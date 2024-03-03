package main.linked_list;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node insertFront(int key) {
        Node newNode = new Node(key);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        return head;
    }

    public Node insert(int key, Node node) {
        if (node == null) {
            return null;
        }

        Node newNode = new Node(key);

        if (node == head) {
            return insertFront(key);
        }

        Node predecessor = node.prev;
        newNode.prev = predecessor;
        newNode.next = node;
        predecessor.next = newNode;
        node.prev = newNode;

        return newNode;
    }

    public void print() {
        System.out.print("Linked List{");
        Node current = head;

        while (current != null) {
            System.out.print(current.key);
            current = current.next;
            if (current != null) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}
