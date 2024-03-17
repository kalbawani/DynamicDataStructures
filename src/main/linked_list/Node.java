package main.linked_list;

public class Node<K,V> {
    public K key;
    public V value;
    public Node<K,V> prev;
    public Node<K,V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
