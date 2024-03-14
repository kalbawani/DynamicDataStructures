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
        //implement me
    }

    public int find(int key) {
        //implement me
        //Return the index if the key exists; otherwise, return -1.
    }

    public void delete(int key) {
        //implement me
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            DoublyLinkedList list = table[i];
            System.out.println(i + " : " + list.toString());
        }
    }

    private int hash(int id) {
        //implement me
    }
}
