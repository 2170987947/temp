package test0610;

import java.util.Scanner;

public class Ex8 {
    // 五子棋
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            char[][] map = new char[20][20];
            for (int i = 0; i < 20; i++) {
                String line = s.nextLine();
                for (int j = 0; j < 20; j++) {
                    map[i][j] = line.charAt(j);
                }
            }
            System.out.println(Solve(map) ? "Yes" : "No");
        }
    }

    private static boolean Solve(char[][] map) {
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {
                if (map[row][col] == '+' || map[row][col] == '*') {
                    if (isWinner(map, map[row][col], row, col) >= 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int isWinner(char[][] map, char ch, int row, int col) {
        int[][][] dir = new int[][][] {
                {{-1, 0}, {1, 0}},
                {{0, -1}, {0, 1}},
                {{-1, -1}, {1, 1}},
                {{-1, 1}, {1, -1}}
        };
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 2; j++) {
                int nx = row;
                int ny = col;
                while (nx >= 0 && nx < 20 && ny >= 0 && ny < 20 && map[nx][ny] == ch) {
                    count++;
                    nx = nx + dir[i][j][0];
                    ny = ny + dir[i][j][1];
                }
            }
            result = Math.max(result, count);
        }
        return result - 1;
    }
}
