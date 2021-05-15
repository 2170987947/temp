package test0515;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
        }
    }

    public int getMost(int[][] board) {
        // write code here
        for (int j = 1; j < board[0].length; j++) {
            board[0][j] += board[0][j - 1];
        }
        for (int i = 1; i < board.length; i++) {
            board[i][0] += board[i - 1][0];
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                board[i][j] = Math.max(board[i][j - 1], board[i - 1][j]);
            }
        }
        return board[5][5];
    }

}
