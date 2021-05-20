package test0517;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            while (line.length() > 1) {
                int n = 0;
                for (int i = 0; i < line.length(); i++) {
                    n += line.charAt(i) - '0';
                }
                line = String.valueOf(n);
            }
            System.out.println(line);
        }
    }
}
