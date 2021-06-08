package test0608;

import java.util.Scanner;

public class Ex3 {
    private static int count = 0;
    // 深度优先遍历：邻接矩阵
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int m = s.nextInt();
            int n = s.nextInt();
            s.nextLine();
            int x = 0, y = 0;
            if (m * n == 0) {
                continue;
            }
            char[][] p = new char[m][n];
            for (int i = 0; i < m; i++) {
                String t = s.nextLine();
                for (int j = 0; j < n; j++) {
                    p[i][j] = t.charAt(j);
                    if (p[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            count = 0;
            boolean[][] flag = new boolean[m][n];
            DFS(p, x, y, flag);
            System.out.println(count);
        }
    }
    private static void DFS(char[][] p, int x, int y, boolean[][] flag) {
        if (p[x][y] == '#') {
            return;
        }
        flag[x][y] = true;
        count++;
        if (is(p,x - 1, y) && !flag[x - 1][y]) {
            DFS(p, x - 1, y, flag);
        }
        if (is(p, x + 1, y) && !flag[x + 1][y]) {
            DFS(p, x + 1, y, flag);
        }
        if (is(p, x, y - 1) && !flag[x][y - 1]) {
            DFS(p, x, y - 1, flag);
        }
        if (is(p, x, y + 1) && !flag[x][y + 1]) {
            DFS(p, x, y + 1, flag);
        }
    }
    private static boolean is(char[][] p, int x, int y) {
        return (x >= 0 && x < p.length && y >= 0 && y < p[0].length);
    }
}
