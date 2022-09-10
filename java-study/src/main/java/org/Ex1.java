package org;

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}
public class Ex1 {
    public Node add(Node l1, Node l2) {
        Node a = reverse(l1);
        Node b = reverse(l2);
        Node head = new Node(0);
        Node cur = head;
        int jin = 0;
        while (a != null || b != null) {
            int num1 = (a != null) ? a.val : 0;
            int num2 = (b != null) ? b.val : 0;
            int sum = num1 + num2 + jin;
            cur.next = new Node(sum % 10);
            jin = sum / 10;
            cur = cur.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (jin > 0) {
            cur.next = new Node(jin);
        }
        return head.next;
    }
    private Node reverse(Node l1) {
        if (l1 == null) {
            return l1;
        }
        Node pre = null;
        Node cur = l1;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
