package test0604;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String[] a = new String[20];
            for (int i = 0; i < 20; i++) {
                a[i] = s.nextLine();
            }
            isWin(a);
        }
    }

    private static void isWin(String[] a) {
    }
}
