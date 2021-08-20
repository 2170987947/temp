package org.example.java21_0820;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        String a = " 123456789ABCDEF";
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        Stack<Character> stack = new Stack<>();
        while (m > 0) {
            int yu = m % n;
            stack.push(a.charAt(yu));
            m /= n;
        }
        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }
}
