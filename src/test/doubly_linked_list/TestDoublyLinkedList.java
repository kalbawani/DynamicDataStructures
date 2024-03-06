package test.doubly_linked_list;

import main.linked_list.*;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.print();
        dll.insertFront('H');
        dll.print();
    }
}
