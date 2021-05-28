package test0528;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = in.nextInt();
            String g = in.nextLine();
            for (int i = 0; i < n; i++) {
                print(in.nextLine());
                if (i  < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static void print(String s) {
        String[] p = s.split(",");
        if (p.length == 1) {
            System.out.print(s);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        for (int i = 0; i < p.length; i++) {
            stringBuffer.append(p[i]);
            if (i < p.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("\"");
        System.out.print(stringBuffer);
    }
}
