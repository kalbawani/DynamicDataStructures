package main.linked_list;

public class DoublyLinkedList <T> {
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

    public Node insertFront(T key) {
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

    public Node insert(T key, Node node) {
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

    public Node insertBack(T key) {
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
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        if (node == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return;
        }

        if (node != head && node != tail) {
            Node predecessor = node.prev;
            predecessor.next = node.next;
            Node successor = node.next;
            successor.prev = node.prev;
        }
    }

    public Node find(T key) {
        Node current = head;

        while (current != null && current.key != key) {
            current = current.next;
        }

        return current;
    }

    public void delete(T key) {
        Node node = find(key);
        delete(node);
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
