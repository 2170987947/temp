package test0528;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(ratio(n) * 100 + "0%");
        }
    }

    private static float ratio(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        int bu = total - total / n;
        total *= 100;
        return (float) bu / total;
    }
}
