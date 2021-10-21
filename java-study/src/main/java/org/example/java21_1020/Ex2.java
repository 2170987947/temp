package org.example.java21_1020;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ListNode p0 = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(4);
        ListNode p6 = new ListNode(5);
        p0.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;

        System.out.println(ex2.deleteDuplication(p0));
    }

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode cur = pHead;
        Set<Integer> set = new HashSet<>();
        ListNode pre = null;
        while (cur != null) {
            if (set.add(cur.val)) {
                if (pre == null) {
                    pre = cur;
                } else {
                    pre.next = cur;
                    pre = pre.next;
                }
            }
            cur = cur.next;
        }
        pre.next = null;
        return pHead;
    }
}
