package main.linked_list;

public class DoublyLinkedList<K,V> {
    private Node<K,V> head;
    private Node<K,V> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertFront(K key, V value) {
        Node<K,V> newNode = new Node<>(key, value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insert(K key, V value, Node<K,V> node) {
        if (node == null) {
            return;
        }

        if (node == head) {
            insertFront(key, value);
        }

        Node<K,V> newNode = new Node<>(key, value);

        Node<K,V> predecessor = node.prev;
        newNode.prev = predecessor;
        newNode.next = node;
        predecessor.next = newNode;
        node.prev = newNode;
    }

    public void insertBack(K key, V value) {
        Node<K,V> newNode = new Node<>(key, value);

        if (tail == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }

        tail = newNode;
    }

    public void delete(Node<K,V> node) {
        if (node == null) {
            return;
        }

        if (node == head) {
            head = node.next;
        } else {
            Node<K,V> predecessor = node.prev;
            predecessor.next = node.next;
        }

        if (node == tail) {
            tail = node.prev;
        } else {
            Node<K,V> successor = node.next;
            successor.prev = node.prev;
        }
    }

    private Node<K,V> getNode(K key) {
        Node<K,V> current = head;

        while (current != null && current.key != key) {
            current = current.next;
        }

        return current;
    }

    public V find(K key) {
        Node<K,V> node = getNode(key);
        return (node != null ? node.value : null);
    }

    public void delete(K key) {
        Node<K,V> node = getNode(key);
        delete(node);
    }

    public String toString() {
        String str = "Linked List{";
        Node<K,V> current = head;

        while (current != null) {
            str += "[" + current.key.toString() + ", " + current.value.toString() + "]";
            current = current.next;
            if (current != null) {
                str += ", ";
            }
        }

        str += "}";
        return str;
    }
}
