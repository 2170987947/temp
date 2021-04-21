package java0108;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("原数组 arr : " + Arrays.toString(arr));
        toString(arr);
    }

    public static void toString(int[] arr) {
        String ret = "\"[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                ret += arr[i] + "]\"";
            } else {
                ret += arr[i]+",";
            }
        }
        System.out.println("转换成字符串为 : " + ret);
    }
}
