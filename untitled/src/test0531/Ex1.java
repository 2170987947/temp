package test0531;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            s.nextLine();
            int con = 0;
            int create = 0;
            while (n > 0) {
                String a = s.nextLine();
                String[] p = a.split(" ");
                if (p[1].equals("connect")) {
                    if (con == 0) {
                        create++;
                    } else {
                        con--;
                    }
                } else {
                    con++;
                }
                n--;
            }
            System.out.println(create);
        }
    }
}
