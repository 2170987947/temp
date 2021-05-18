package test0518;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        while (in.hasNextInt()) {
            String str = in.nextLine();
            String[] p = str.split(" ");

            int n = Integer.parseInt(p[0]);
            int r = Integer.parseInt(p[1]);
            if (2 * 3.14 * r < n) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }

}
