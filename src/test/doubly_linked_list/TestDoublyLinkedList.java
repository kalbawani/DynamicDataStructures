package test.doubly_linked_list;

import main.linked_list.*;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.print();
        dll.insertFront('H');
        dll.print();
        dll.insertFront('E');
        dll.print();
        dll.insertBack('K');
        dll.print();
        dll.insertFront('L');
        dll.print();
        dll.insertFront('J');
        dll.print();
        dll.delete('J');
        dll.print();
        dll.delete('K');
        dll.print();
        dll.delete('E');
        dll.print();
        dll.delete('L');
        dll.print();
        dll.delete('H');
        dll.print();
        dll.insertBack('K');
        dll.print();
        dll.insertFront('L');
        dll.print();
        dll.insertFront('J');
        dll.print();
    }
}
