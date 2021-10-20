package org.example.java21_1020;

import org.example.java21_0813.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.add(1);
        int[] arr = new int[]{1, 3, 2, 5, 9, 0};
        System.out.println(Arrays.toString(list.toArray()));
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList<Integer>();
        ListNode cur = listNode;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
