package test.hash_table;

import main.hash_table.*;
import test.*;

public class TestOpenHashTable {
    public static void main(String[] args) {
        Student student1 = new Student(76, "John", "Smith");
        Student student2 = new Student(27, "Emily", "Johnson");
        Student student3 = new Student(13, "Sophia", "Williams");
        Student student4 = new Student(41, "Benjamin", "Brown");
        Student student5 = new Student(20, "Thomas", "Davis");
        Student student6 = new Student(55, "Eva", "Miller");
        Student student7 = new Student(6, "Olivia", "Jones");

        OpenHashTable<Student, Double> grades = new OpenHashTable<>(7);

        grades.insert(student1, 56.0);
        grades.insert(student2, 78.5);
        grades.insert(student3, 88.0);
        grades.insert(student4, 95.5);
        grades.insert(student5, 43.0);
        grades.insert(student6, 39.5);
        grades.insert(student7, 84.0);

        grades.print();

        System.out.println();

        System.out.println("Result of Student with ID " + student5.getId() + " is " + grades.find(student5));

        grades.delete(student5);

        System.out.println();

        System.out.println("Result of Student with ID " + student5.getId() + " is " + grades.find(student5));
    }
}
