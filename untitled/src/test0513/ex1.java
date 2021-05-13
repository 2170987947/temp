package test0513;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 12:10
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int empty = in.nextInt();
            int ret = count(empty);
            if (ret == 0) {
            } else {
                System.out.println(ret);
            }
        }
    }

    private static int count(int empty) {
        int count = 0;
        if (empty == 2) {
            return 1;
        }
        if (empty < 3) {
            return 0;
        }
        count += empty / 3 + count(empty / 3 + empty % 3);
        return count;
    }
}
