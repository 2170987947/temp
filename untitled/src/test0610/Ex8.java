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
            if (isWinner(map) >= 5) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static int isWinner(char[][] map) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 2; j++) {
                count += qizi(map, map[i][j], i, j);
            }
            result = Math.max(result, count);
        }
        return result - 1;
    }

    private static int qizi(char[][] map, char c, int i, int j) {
        int count = 0;

        return count;
    }
}
