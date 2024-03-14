package test.hash_table;

import main.hash_table.HashTable;

public class TestHashTable {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(7);
        hashTable.insert(50);
        hashTable.insert(700);
        hashTable.insert(76);
        hashTable.insert(85);
        hashTable.insert(92);
        hashTable.insert(73);
        hashTable.insert(101);
        hashTable.print();
        System.out.println();
        System.out.println("Element 92 is at index " + hashTable.find(92));
        System.out.println("Element 47 is at index " + hashTable.find(47));
    }

}
