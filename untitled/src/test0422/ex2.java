package test0422;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 13:42
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        if (m < 0) {
            m = -m;
            flag = false;
        }
        while (m > 0) {
            int c = (m % n);
            if (c >= 0 && c < 10) {
                stack.push((char) ((m % n) + '0'));
            } else {
                stack.push((char) ((c - 10) + 'A'));
            }
            m /= n;
        }
        StringBuffer s = new StringBuffer();
        if (flag == false) {
            s.append('-');
        }
        while (!stack.isEmpty()) {
// System.out.println(stack.peek());
            s.append(stack.pop());
        }
        System.out.println(s.toString());
    }
}