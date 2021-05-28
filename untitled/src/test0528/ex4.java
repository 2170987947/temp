package test0528;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            String b = in.nextLine();
            print(a, b);
        }
    }

    private static void print(String a, String b) {
        if (!a.contains("\"")) {
            System.out.println("Ignore");
            return;
        }
        int start;
        int end = 0;
        while (true) {
            start = a.indexOf('\"', end);
            end = a.indexOf('\"', start + 1);
            if (start == -1 || end == -1) {
                break;
            }
            end += 1;
            if (a.substring(start, end).contains(b)) {
                System.out.println("Important!");
            }
        }

    }
}
