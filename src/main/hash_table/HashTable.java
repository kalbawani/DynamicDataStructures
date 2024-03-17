package main.hash_table;

import main.linked_list.*;

public class HashTable<K,V> {
    private final DoublyLinkedList<K,V>[] table;
    private final int size;

    public HashTable(int size) {
        this.size = size;
        table = new DoublyLinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new DoublyLinkedList<>();
        }
    }

    public void insert(K key, V value) {
        int index = hash(key);
        DoublyLinkedList<K,V> list = table[index];
        list.insertBack(key, value);
    }

    public V find(K key) {
        int index = hash(key);
        DoublyLinkedList<K,V> list = table[index];
        return list.find(key);
    }

    public void delete(K key) {
        int index = hash(key);
        DoublyLinkedList<K,V> list = table[index];
        list.delete(key);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            DoublyLinkedList<K,V> list = table[i];
            System.out.println(i + " : " + list.toString());
        }
    }

    private int hash(K key) {
        return key.hashCode() % this.size;
    }
}
