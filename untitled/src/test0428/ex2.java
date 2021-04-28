package test0428;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/28 8:16
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            int i = n;
            while (i > 0) {
                if ((i & 1) == 1) {
                    count++;
                }
                i >>= 1;
            }
            System.out.println(count);
        }
    }
}
