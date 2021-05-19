package test0515;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{426, 306, 641, 372, 477, 409},
                {223, 172, 327, 586, 363, 553},
                {291, 645, 248, 316, 711, 295},
                {127, 192, 495, 208, 547, 175},
                {131, 448, 178, 264, 207, 676},
                {655, 407, 309, 358, 246, 714}
        };
        System.out.println(getMost(arr));
    }

    public static int getMost(int[][] board) {
        // write code here
        for (int j = 1; j < board[0].length; j++) {
            board[0][j] += board[0][j - 1];
        }
        for (int i = 1; i < board.length; i++) {
            board[i][0] += board[i - 1][0];
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                board[i][j] += Math.max(board[i][j - 1], board[i - 1][j]);
            }
        }
        return board[board.length - 1][board[0].length - 1];
    }

}
