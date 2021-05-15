package test0515;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int r = in.nextInt();
            int l = in.nextInt();
            int[][] arr = new int[r][l];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < l; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            System.out.println("(0,0)");
            migong(arr, 0 , 0);
        }
    }

    private static boolean migong(int[][] arr, int i, int j) {
        for (; i < arr.length; i++) {
            for (; j < arr[0].length; j++) {
                if (j < arr[0].length) {
                    if (j < arr[0].length - 1) {
                        if (arr[i][j + 1] == 1) {
                            break;
                        } else {
                            if (migong(arr, i, j + 1)) {
                                System.out.println("(" + i + "," + j + 1 + ")");
                            }
                        }
                    } else {

                    }
                }
                if (i < arr.length) {
                    if (i < arr.length - 1) {
                        if (j < arr[0].length - 1) {
                            if (arr[i + 1][j] == 1) {
                                break;
                            } else {
                                if (migong(arr, i + 1, j)) {
                                    System.out.println("(" + i + 1 + "," + j + ")");
                                }
                            }
                        } else {

                        }
                    }
                }
            }
        }
        return true;
    }
}
