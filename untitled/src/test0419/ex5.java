package test0419;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/19 22:32
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        reverse(arr, 0, str.length());
        int i = 0;
          while (i  < str.length()) {
            int j = i;
            while (j < str.length() && arr[j] != ' ') {
                j++;
            }
            if (j == str.length()) {
                reverse(arr, i, j);
                i = j;
            } else {
                reverse(arr, i, j);
                i = j + 1;
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }

    private static char[] reverse(char[] arr, int i, int length) {
        int j = length - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return arr;
    }
}
