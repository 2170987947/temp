package java0108;

import java.util.Arrays;

public class Initarray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(init(arr)));
    }

    public static int[] init(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
