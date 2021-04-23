package test0423;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 12:53
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int count = 0;
        int[][] arr = new int[w][h];
        for (int row = 0; row < w; row++) {
            for (int col = 0; col < h; col++) {
                if (arr[row][col] == 0) {
                    count++;
                }
                if (row + 2 < w) {
                    arr[row + 2][col] = 1;
                }
                if (col + 2 < h) {
                    arr[row][col + 2] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
