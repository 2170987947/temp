package test0419;


import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/19 18:49
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] a = s.split(" ");
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        StringBuffer result = new StringBuffer();
        for (int m = 0; m < a.length; m++) {
            result.append(a[m]);
            if (m < a.length - 1) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}
