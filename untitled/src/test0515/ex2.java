package test0515;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(distance(a, b));
        }
    }

    private static int distance(String a, String b) {
        int[][] arr = new int[b.length() + 1][a.length() + 1];
        arr[0][0]= 0;
        for (int i = 1; i < b.length() + 1; i++) {
            arr[i][0] = i;
        }
        for (int j = 1; j < a.length() + 1; j++) {
            arr[0][j] = j;
        }
        for (int i = 1; i < b.length() + 1; i++) {
            for (int j = 1; j < b.length() + 1; j++) {
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i < b.length() + 1; i++) {
            for (int j = 1; j < a.length() + 1; j++) {
                if (b.charAt(i - 1) == a.charAt(j - 1)) {
                    arr[i][j] = cmp(arr[i][j - 1] + 1, arr[i - 1][j] + 1, arr[i - 1][j - 1]);
                } else {
                    arr[i][j] = cmp(arr[i][j - 1] + 1, arr[i - 1][j] + 1, arr[i - 1][j - 1] + 1);
                }
            }
        }
        return arr[b.length()][a.length()];
    }

    private static int cmp(int i, int i1, int i2) {
        return Math.min(i, Math.min(i1, i2));
    }
}
