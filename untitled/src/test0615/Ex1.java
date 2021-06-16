package test0615;

import java.util.Scanner;

public class Ex1 {
    // 红与黑： 深度优先搜素
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int m = s.nextInt();
            int n = s.nextInt();
            char[][] map = new char[m][n];
            for (int i = 0; i < m; i++) {
                map[i] = s.nextLine().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    count = Math.max(countMax(map, m, n), count);
                }
            }
            System.out.println(countMax(map, m, n));
        }
    }

    private static int countMax(char[][] map, int m, int n) {
        int count = 0;
        return count;
    }

}
