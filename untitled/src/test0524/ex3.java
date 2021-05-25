package test0524;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            int count = 0;
            while (n >= 2) {
                n = (int)Math.ceil((double)n / 3);
                count++;
            }
            System.out.println(count);
        }
    }
}
