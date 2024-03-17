package test.hash_table;

import main.hash_table.*;

public class TestHashTable {
    public static void main(String[] args) {
        Student student1 = new Student(50, "AAA", "ZZZ");
        Student student2 = new Student(700, "BBB", "YYY");
        Student student3 = new Student(76, "CCC", "XXX");
        Student student4 = new Student(85, "DDD", "TTT");
        Student student5 = new Student(92, "EEE", "SSS");
        Student student6 = new Student(73, "FFF", "UUU");
        Student student7 = new Student(101, "GGG", "PPP");

        HashTable<Student, String> results = new HashTable<>(7);
        results.insert(student1, "Pass");
        results.insert(student2, "Fail");
        results.insert(student3, "Pass");
        results.insert(student4, "Pass");
        results.insert(student5, "Fail");
        results.insert(student6, "Pass");
        results.insert(student7, "Pass");
        results.print();
        System.out.println();
        System.out.println("Result of Student with ID 92 is " + results.find(student5));
        results.delete(student5);
        System.out.println();
        System.out.println("Result of Student with ID 92 is " + results.find(student5));
    }
}
