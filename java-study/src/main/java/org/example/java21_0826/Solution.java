package org.example.java21_0826;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().StrToInt("+2147483647"));
        System.out.println(new Solution().chkParenthesis("())()()(((d",11));
    }
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char a = A.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else if (!stack.isEmpty() && a == ')' && '(' == stack.peek()) {
                stack.pop();
            } else if (!stack.isEmpty() && a == '}' && '{' == stack.peek()) {
                stack.pop();
            } else if (!stack.isEmpty() && a == '}' && '{' == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int StrToInt(String str) {
        StringBuffer r = new StringBuffer();
        int a = 1;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (flag && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                while (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                    if (str.charAt(i) == '+') {
                        a *= 1;
                    } else {
                        a *= -1;
                    }
                    i++;
                }
                if (a < 0) {
                    r.append('-');
                }
            }
            if (i < str.length() && Character.isDigit(str.charAt(i))) {
                r.append(str.charAt(i));
            } else {
                return 0;
            }
        }
        if (str.length() == 0) {
            r.append(0);
        }
        return Integer.parseInt(r.toString());
    }
    
}