package test0507;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            System.out.println(qiu(n));
        }
    }

    private static int qiu(int n) {
        int[][] arr = new int[n][2 * n + 1];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
            arr[i][1] = i;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 2 * i + 1; j >= 2; j--) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1] + arr[i - 1][j - 2];
            }
        }
        for (int j = 0; j < 2 * n - 1; j++) {
            if (arr[n - 1][j] % 2 == 0) {
                return j + 1;
            }
        }
        return 0;
    }
}