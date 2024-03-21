package main.hash_table;

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
        int i = hash(key);
        int count = 0;

        while (count < size && table[i] != null) {
            i = (i + 1) % size;
            ++count;
        }

        if (count < size) {
            table[i] = new HashEntry<>(key, value);
        } else {
            System.out.println("Hash table overflow");
        }
    }

    public V find(K key) {
        int i = hash(key);
        int count = 0;

        while (count < size) {
            if (table[i] != null && Objects.equals(table[i].getKey(), key)) {
                return table[i].getValue();
            }
            i = (i + 1) % size;
            ++count;
        }

        return null;
    }

    public void delete(K key) {
        int i = hash(key);
        int count = 0;

        while (count < size) {
            if (table[i] != null && Objects.equals(table[i].getKey(), key)) {
                table[i] = null;
            }
            i = (i + 1) % size;
            ++count;
        }
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
