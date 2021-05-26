package test0526;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(pipei(a, b));
        }
    }

    private static int pipei(String a, String b) {
        int count = 0;
        for (int i = 0; i <= a.length() - b.length(); i += b.length()) {
            if (a.substring(i, i + b.length()).equals(b)) {
                count++;
            }
        }
        return count;
    }
}
