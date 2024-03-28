package main.binary_search_tree;

import java.util.*;

public class BinarySearchTree<K extends Comparable,V> {
    private Node<K,V> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void sort() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.toString() + "  ");
            inOrder(node.right);
        }
    }

    public void insert(K key, V value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
            return;
        }

        insert(newNode, root);
    }

    private void insert(Node newNode, Node currentNode) {
        if (newNode.key.compareTo(currentNode.key) < 0) {
            if (currentNode.left != null) {
                insert(newNode, currentNode.left);
            } else {
                currentNode.left = newNode;
                newNode.parent = currentNode;
            }
        } else {
            if (currentNode.right != null) {
                insert(newNode, currentNode.right);
            } else {
                currentNode.right = newNode;
                newNode.parent = currentNode;
            }
        }
    }

    public V find(K key) {
        Node<K,V> node = find(key, root);
        return (node == null ? null : node.value);
    }

    private Node<K,V> find(K key, Node<K,V> node) {
        if (node == null || key.compareTo(node.key) == 0) {
            return node;
        }

        if (key.compareTo(node.key) < 0) {
            return find(key, node.left);
        } else {
            return find(key, node.right);
        }
    }

    public void delete(K key) {
        Node node = find(key, root);
        delete(node);
    }

    private void delete(Node<K,V> node) {
        if (node.left == null) {
            transplant(node, node.right);
        } else if (node.right == null) {
            transplant(node, node.left);
        } else {
            Node nextMin = minimum(node.right);
            if (nextMin.parent != node) {
                transplant(nextMin, nextMin.right);
                nextMin.right = node.right;
                nextMin.right.parent = nextMin;
            }
            transplant(node, nextMin);
            nextMin.left = node.left;
            nextMin.left.parent = nextMin;
        }
    }

    private void transplant(Node<K,V> u, Node<K,V> v) {
        if (u.parent == null) {
            root = v;
        } else if (u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }

        if (v != null) {
            v.parent = u.parent;
        }
    }

    public Node minimum(Node<K,V> node) {
        // implement me
    }

    public Node maximum(Node<K,V> node) {
        // implement me
    }

    public K successor(K key) {
        // implement me
    }

    public K predecessor(K key) {
        // implement me
    }

}
