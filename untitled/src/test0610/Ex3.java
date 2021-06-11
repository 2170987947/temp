package test0610;

import java.util.Scanner;

public class Ex3 {
    // 蘑菇阵：不触碰到蘑菇的情况下从A到B的概率
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] map = new int[n + 1][m + 1];
            int k = s.nextInt();
            // 放置蘑菇
            for (int i = 0; i < k; i++) {
                map[s.nextInt()][s.nextInt()] = 1;
            }
            gaiLu(map, n, m);
        }
    }

    private static void gaiLu(int[][] map, int n, int m) {
        double[][] r = new double[n + 1][m + 1];
        r[1][1] = 1.0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                if (map[i][j] == 1) {
                    r[i][j] = 0.0;
                } else {
                    r[i][j] = (r[i - 1][j] * (j == m ? 1.0 : 0.5) + r[i][j - 1] * (i == n ? 1.0 : 0.5));
                }
            }
        }
        System.out.printf("%.2f\n", r[n][m]);
    }
}
