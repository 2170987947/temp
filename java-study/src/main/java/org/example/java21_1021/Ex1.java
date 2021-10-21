package org.example.java21_1021;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 4, 3, 0, 8, 7, 9, 4};
        System.out.println(findRepeatNumber(arr));
    }

    private static int findRepeatNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int r = -1;
        for (int i : arr) {
            if (!set.add(i)) {
                r = i;
                break;
            }
        }
        return r;
    }
}
