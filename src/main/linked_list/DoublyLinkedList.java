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

        if (node == head) {
            return insertFront(key);
        }

        Node newNode = new Node(key);

        Node predecessor = node.prev;
        newNode.prev = predecessor;
        newNode.next = node;
        predecessor.next = newNode;
        node.prev = newNode;

        return newNode;
    }

    public Node insertBack(int key) {
        Node newNode = new Node(key);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        return tail;
    }

    public void delete(Node node) {
        if (node == null) {
            return;
        }

        if (node == head) {
            head = node.next;
        } else {
            Node predecessor = node.prev;
            predecessor.next = node.next;
        }

        if (node == tail) {
            tail = node.prev;
        } else {
            Node successor = node.next;
            successor.prev = node.prev;
        }
    }

    public Node find(int key) {
        Node current = head;

        while (current != null && current.key != key) {
            current = current.next;
        }

        return current;
    }

    public void delete(int key) {
        Node node = find(key);
        delete(node);
    }

    public String toString() {
        String str = "Linked List{";
        Node current = head;

        while (current != null) {
            str += current.key;
            current = current.next;
            if (current != null) {
                str += ", ";
            }
        }

        str += "}";
        return str;
    }
}
