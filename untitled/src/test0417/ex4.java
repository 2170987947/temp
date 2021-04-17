package test0417;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 14:46
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int result = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int temp = jiaoyan(w, h, i, j);
                if (result < temp) {
                    result = temp;
                }
            }
        }
        System.out.println(result);
    }

    private static int jiaoyan(int w, int h, int i, int j) {
        int result = 0;
        return result;
    }
}