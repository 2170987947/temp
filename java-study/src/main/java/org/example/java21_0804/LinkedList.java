package org.example.java21_0804;

public class LinkedList {
    public Node head;

    public LinkedList() {

    }

    public boolean add(Node node) {
        Node cur = head;
        if (head == null) {
            head = node;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        return true;
    }

    public boolean remove(Node node) {
        Node cur = head;
        if (head == null) {
            return false;
        }
        Node pre = null;
        while (cur != null) {
            pre = cur;
            if (cur == node) {
                pre.next = cur.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}
