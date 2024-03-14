package main.linked_list;

import java.util.*;

public class Node <T> {
    public T key;
    Node prev;
    Node next;

    public Node(T key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(key, node.key) && Objects.equals(prev, node.prev) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, prev, next);
    }
}
