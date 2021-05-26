package test0525;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    count++;
                }
            }
            if (n != 1) {
                count++;
            }
            System.out.println(count);
        }
    }
}
