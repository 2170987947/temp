package java0108;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 2};
        System.out.println("数组为 : " + Arrays.toString(arr));
        System.out.println("查找 6 是否存在(存在返回其下标,不存在返回-1) : " + binarySearch(arr, 6));
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
