package test0521;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        System.out.println(getFirstUnFormedNum(new int[]{3, 1, 2}));
        System.out.println(getFirstUnFormedNum(new int[]{3, 2, 4}));
        System.out.println(getFirstUnFormedNum(new int[]{3, 2, 5}));
        System.out.println(getFirstUnFormedNum(new int[]{1, 2, 3, 4, 5}));
    }
    public static int getFirstUnFormedNum(int[] arr) {
        Arrays.sort(arr);
        int max = total(arr);
        int min = arr[0];
        for (int i = min; i <= max; i++) {
            if (!ziji(arr, i)) {
                return i;
            }
        }
        return max + 1;
    }

    private static boolean ziji(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum == num) {
                return true;
            }
            int tmp = sum;
            for (int grep = 1; grep < arr.length; grep++) {
                sum = tmp;
                for (int j = i + grep; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private static int total(int[] arr) {
        int max = 0;
        for (int i : arr) {
            max += i;
        }
        return max;
    }
}
