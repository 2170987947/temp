package test0423;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 14:04
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            byte tt = 1;
            int count = 0;
            int ret = 0;
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < 32; i++) {
                if ((n & (tt << i)) > 0) {
                    str.append('1');
                    count++;
                } else {
                    str.append('0');
                    count = 0;
                }
                if (count > ret) {
                    ret = count;
                }
            }
            System.out.println(ret);
        }
    }
}
