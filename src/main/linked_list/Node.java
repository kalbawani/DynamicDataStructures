package main.linked_list;

import java.util.*;

public class Node {
    public int key;
    Node prev;
    Node next;

    public Node(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
