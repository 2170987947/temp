package test0423;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 13:00
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        if (h == 0 || w == 0) {
            System.out.println(0);
        }
        System.out.println(digui(w, h));
    }

    private static int digui(int w, int h) {
        if (w == 1 || h == 1) {
            return 1;
        }
        return digui(w - 1, h) + digui(w, h - 1);
    }
}
