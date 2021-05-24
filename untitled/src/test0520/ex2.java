package test0520;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        oddInOddEvenInEven(new int[]{1, 2, 3, 4});
    }
    public static void oddInOddEvenInEven(int[] arr) {
        int ou = 0, ji = 1;
        while (ou < arr.length && ji < arr.length) {
            if (ou  < arr.length && arr[ou] % 2 == 0) {
                ou += 2;
                continue;
            }
            if (ji < arr.length && arr[ji] % 2 != 0) {
                ji += 2;
                continue;
            }
            if (ou >= arr.length || ji >= arr.length) {
                break;
            }
            swap(ji, ou, arr);
        }
//        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int ji, int ou, int[] arr) {
        int tmp = arr[ji];
        arr[ji] = arr[ou];
        arr[ou] = tmp;
    }
}
