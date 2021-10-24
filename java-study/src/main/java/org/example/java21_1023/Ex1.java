package org.example.java21_1023;

import org.example.java21_1020.ListNode;

public class Ex1 {
    public static void main(String[] args) {

    }

    public boolean isPail (ListNode head) {
        if(head == null){
            return true;
        }
        // write code here
        ListNode p = null;
        ListNode c = head;
        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        c = head;
        while (c != null && p != null) {
            if (c.val != p.val) {
                return false;
            }
            c = c.next;
            p = p.next;
        }
        return true;
    }
}
