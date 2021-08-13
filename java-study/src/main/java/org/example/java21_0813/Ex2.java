package org.example.java21_0813;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Ex2 {
    /**
     * 
     * @param head1 ListNode类 
     * @param head2 ListNode类 
     * @return ListNode类
     */

    public static void main(String[] args) {
        ListNode h1 = new ListNode(9);
        h1.next = new ListNode(3);
        h1.next.next = new ListNode(7);
        ListNode h2 = new ListNode(6);
        h2.next = new ListNode(3);
        new Ex2().addInList(h1, h2);
    }
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        Deque<Integer> sta1 = toStack(head1);
        Deque<Integer> sta2 = toStack(head2);
        ListNode r = new ListNode(0);
        ListNode cur = r;
        int jin = 0;
        while (!sta1.isEmpty() && !sta2.isEmpty()) {
            int a = sta1.pop();
            int b = sta2.pop();
            int c = a + b + jin;
            if (c > 9) {
                jin = c / 10;
                c = c % 10;
            }
            ListNode node = new ListNode(c);
            node.next = r.next;
            r.next = node;
        }
        while (!sta1.isEmpty()) {
            int c = jin + sta1.pop();
            if (c > 9) {
                jin = c / 10;
                c = c % 10;
            }
            ListNode node = new ListNode(c);
            node.next = r.next;
            r.next = node;
        }
        while(!sta2.isEmpty()) {
            int c = jin + sta2.pop();
            if (jin > 9) {
                jin = c / 10;
                c = c % 10;
            }
            ListNode node = new ListNode(c);
            node.next = r.next;
            r.next = node;
        }
        return r.next;
    }
    
    private Deque<Integer> toStack(ListNode h) {
        Deque<Integer> s = new LinkedList<>();
        while (h != null) {
            s.push(h.val);
            System.out.println(h.val);
            h = h.next;
        }
        return s;
    }
}