package org.example.java21_0810;

public class LinkedList {
    private Node head;
    private Node last;
    private int size;

    public boolean add(Integer e) {
        Node newNode = new Node(e);
        Node l = last;
        last = newNode;
        if (l == null) {
            this.head = newNode;
        } else {
            l.next = newNode;
        }
        this.size++;
        return true;
    }

    public boolean delete(Integer e) {
        if (e == null) {
            for (Node node = this.head; node != null; node = node.next) {
                if (node.data == e) {
                    unlink(node);
                    this.size--;
                    return true;
                }
            }
        } else {
            for (Node node = this.head; node != null; node = node.next) {
                if (e.equals(node.data)) {
                    unlink(node);
                    this.size--;
                    return true;
                }
            }
        }
        return false;
    }

    private void unlink(Node node) {
        Node cur = this.head;
        if (cur == node) {
            this.head = this.head.next;
            if (this.last == node) {
                this.last = this.head;
            }
        }
    }
}
