package org.example.java21_1021;

public class Ex7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 5, 7};
        System.out.println(binarySearch(arr, 5));
    }

    private static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] > target) {
                r = m - 1;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                while (m > 0 && arr[m] == arr[m - 1]) {
                    m--;
                }
                return m;
            }
        }
        return -1;
    }
}
