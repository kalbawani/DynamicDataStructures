package main.hash_table;

import main.linked_list.*;

import java.util.*;

public class OpenHashTable <K,V> {
    private final HashEntry<K,V>[] table;
    private final int size;

    public OpenHashTable(int size) {
        this.size = size;
        table = new HashEntry[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    public void insert(K key, V value) {
        // implement me
    }

    public V find(K key) {
        // implement me
    }

    public void delete(K key) {
        // implement me
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + table[i].toString());
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % this.size;
    }
}
