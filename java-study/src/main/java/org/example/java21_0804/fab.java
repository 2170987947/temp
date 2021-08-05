package org.example.java21_0804;

public class fab {
    public static void main(String[] args) {
        int one = 1;
        int two = 1;
        int r = 0;
        for (int i = 1; i <= 4; i++) {
            r = one + two;
            one = two;
            two = r;
        }
        System.out.println(r);
    }
}
