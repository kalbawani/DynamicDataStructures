package main.binary_search_tree;

import java.util.*;

public class Node<K extends Comparable,V> {
    public K key;
    public V value;
    public Node<K,V> parent;
    public Node<K,V> left;
    public Node<K,V> right;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "<" + key.toString() + "," + value.toString() + ">";
    }
}
