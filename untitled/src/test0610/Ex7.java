package test0610;

import java.util.Scanner;
import java.util.Stack;

public class Ex7 {
    // Emacs计算器
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            Stack<Integer> stack = new Stack<>();
            while (s.hasNext()) {
                String t = s.next();
                if (t.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (t.equals("-")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                } else if (t.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (t.equals("/")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                } else {
                    stack.push(Integer.parseInt(t));
                }
            }
            System.out.println(stack.pop());
        }
    }
}
