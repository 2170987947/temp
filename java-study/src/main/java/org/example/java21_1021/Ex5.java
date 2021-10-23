package org.example.java21_1021;

public class Ex5 {

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        System.out.println(ex5.LCS("1A2C3D4B56","B1D23A456A"));
    }

    public String LCS (String s1, String s2) {
        // write code here
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int n = a.length;
        int m = b.length;
        int[][] arr = new int[a.length + 1][b.length + 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arr[i + 1][j + 1] = Math.max(arr[i][j] + 1, Math.max(arr[i][j + 1], arr[i + 1][j]));
                } else {
                    arr[i + 1][j + 1] = Math.max(arr[i][j], Math.max(arr[i][j + 1], arr[i + 1][j]));
                }
            }
        }
        if (arr[n][m] == 0) {
            return "-1";
        }
        StringBuilder r = new StringBuilder();
        while (n > 0 && m > 0) {
            if (a[n - 1] == b[m - 1]) {
                r.append(a[n - 1]);
                n--;
                m--;
            } else {
                if (arr[n - 1][m] > arr[n][m - 1]) {
                    n--;
                } else {
                    m--;
                }
            }
        }
        return r.reverse().toString();
    }
}
