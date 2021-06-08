package test0608;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            s.nextLine();
            String[] p = new String[n];
            for (int i = 0; i < n; i++) {
                p[i] = s.nextLine();
            }
            Arrays.sort(p);
            boolean[] flag = new boolean[n];
            for (int i = 0; i < n - 1; i++) {
                if (p[i + 1].equals(p[i])) {
                    flag[i] = true;
                } else if (p[i + 1].length() > p[i].length() && p[i + 1].contains(p[i]) && p[i + 1].charAt(p[i].length()) == '/') {
                    flag[i] = true;
                }
            }
            for (int i = 0; i < n; i++) {
                if (flag[i] == false) {
                    System.out.println("mkdir -p " + p[i]);
                }
            }
            System.out.println();
        }
    }
}
