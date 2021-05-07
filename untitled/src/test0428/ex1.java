package test0428;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/28 7:50
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int count = 0;
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < 32; i++) {
                if ((n & (1 << i)) != 0) {
                    str.append('1');
                    count++;
                } else {
                    str.append('0');
                }
            }
//            System.out.println(str.reverse());
            System.out.println(count);
        }
    }
}
