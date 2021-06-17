package test0613;

import java.util.Arrays;

public class Ex2 {

    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] r = new int[n * m];
        int x = 0;
        int y = 0;
        int row = n - 1;
        int col = m - 1;
        int index = 0;
        while (x <= row && y <= col) {
            for (int i = y; i <= col; i++) {
                r[index++] = mat[x][i];
            }
            for (int i = x + 1; i <= row; i++) {
                r[index++] = mat[i][col];
            }
            if (x < row) {
                for (int i = col - 1; i >= y; i++) {
                    r[index++] = mat[row][i];
                }
            }
            if (y < col) {
                for (int i = row - 1; i > x; i++) {
                    r[index++] = mat[i][y];
                }
            }
            x++;
            y++;
            row--;
            col--;
        }
        return r;
    }
}
