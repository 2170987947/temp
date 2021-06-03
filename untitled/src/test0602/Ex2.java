package test0602;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            s.nextLine();
            for (int i = 0; i < n; i++) {
                String a = s.nextLine();
                if (a.contains(" ") || a.contains(",")) {
                    System.out.print("\"" + a + "\"");
                } else {
                    System.out.print(a);
                }
                if (i != n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}