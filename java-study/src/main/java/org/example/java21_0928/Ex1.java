package org.example.java21_0928;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
    }

    private static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = 0;
        int carray = 0;
        while (b != 0){
            sum = a ^ b;
            carray = (a & b) << 1;
            a = sum;
            b = carray;
        }
        return a;
    }
}
