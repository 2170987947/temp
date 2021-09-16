package org.example.java21_0907;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[]{3, 12, 2, 1, 5, 7, 9, 0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr) {
        _quickSort(arr, 0, arr.length - 1);
    }

    private static void _quickSort(int[] arr, int start, int end) {
        if (end - start < 1) {
            return;
        }
        int index = partition(arr, start, end);
        _quickSort(arr, start, index - 1);
        _quickSort(arr, index + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && arr[j] >= arr[start]) {
                j--;
            }
            while (i < j && arr[i] <= arr[start]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, j, start);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void mm(){
        System.out.println("lll");
        System.out.println("Hello");
        System.out.println("lll");
    }
}
