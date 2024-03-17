package main.hash_table;

import main.linked_list.*;

public class HashTable {
    private DoublyLinkedList[] table;
    private final int size;

    public HashTable(int size) {
        this.size = size;
        table = new DoublyLinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new DoublyLinkedList();
        }
    }

    public void insert(int key) {
        int index = hash(key);
        DoublyLinkedList list = table[index];
        list.insertBack(key);
    }

    public int find(int key) {
        int index = hash(key);
        DoublyLinkedList list = table[index];
        return (list.find(key) == null ? -1 : index);
    }

    public void delete(int key) {
        int index = hash(key);
        DoublyLinkedList list = table[index];
        list.delete(key);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            DoublyLinkedList list = table[i];
            System.out.println(i + " : " + list.toString());
        }
    }

    private int hash(int key) {
        return key % this.size;
    }
}
