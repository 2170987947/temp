package org.example.java21_0810;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 4};
        Arrays.sort(arr);
        int[] newArr = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(newArr));
    }
}
