package main.linked_list;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public Node insert(int key, Node node) {
        Node newNode = new Node(key);

        if (node == null) {
            node = head;
        }

        if (head == null) {
            head = newNode;
            return newNode;
        }

        if (node == head) {
            head = newNode;
        } else {
            Node predecessor = node.prev;
            newNode.prev = predecessor;
            predecessor.next = newNode;
        }

        node.prev = newNode;
        newNode.next = node;

        return newNode;
    }

    public void print() {
        System.out.print("Linked List{");
        Node current = head;

        while (current != null) {
            System.out.print(current.key);
            current = current.next;
        }

        System.out.println("{");
    }
}
