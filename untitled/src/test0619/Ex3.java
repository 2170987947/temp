package test0619;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String line1 = s.nextLine();
            char[] line = line1.toCharArray();
            for (int i = 0; i < line.length; i++) {
                if (!((line[i] >= 'a' && line[i] <= 'z')
                        || (line[i] >= 'A' && line[i] <= 'Z'))) {
                    line[i] = ' ';
                }
            }
            String arr = new String(line);
            String[] p = arr.split(" ");
            for (int i = p.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(p[i]);
                } else {
                    System.out.print(p[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
