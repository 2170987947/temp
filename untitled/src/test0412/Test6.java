package test0412;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/12 19:50
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split(" ");
        int i = 0;
        int j = split.length - 1;
        while (i < j) {
            String temp = split[i];
            split[i] = split[j];
            split[j] = temp;
            i++;
            j--;
        }
        StringBuffer result = new StringBuffer();
        for (int m = 0; m < split.length; m++) {
            if (m < split.length) {
                result.append(split[m]);
            }
        }
        System.out.println(result);
    }
}
