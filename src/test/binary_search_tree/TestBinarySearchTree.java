package test.binary_search_tree;

import main.binary_search_tree.*;
import test.*;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        Student student1 = new Student(850, "John", "Smith");
        Student student2 = new Student(270, "Emily", "Johnson");
        Student student3 = new Student(676, "Sophia", "Williams");
        Student student4 = new Student(985, "Benjamin", "Brown");
        Student student5 = new Student(792, "Thomas", "Davis");
        Student student6 = new Student(473, "Eva", "Miller");
        Student student7 = new Student(101, "Olivia", "Jones");

        BinarySearchTree<Student, Double> grades = new BinarySearchTree<Student, Double>();

        grades.insert(student1, 67d);
        grades.insert(student2, 34.5d);
        grades.insert(student3, 89d);
        grades.insert(student4, 77.5d);
        grades.insert(student5, 70d);
        grades.insert(student6, 65d);
        grades.insert(student7, 93d);

        grades.sort();

        System.out.println();

        Student x = student5;

        System.out.println("Grade of Student with ID " + x.getId() + " is " + grades.find(x));

        grades.delete(x);

        System.out.println();

        System.out.println("Grade of Student with ID " + x.getId() + " is " + grades.find(x));
    }
}
