package test0604;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            s.nextLine();
            int r = 0;
            Deque<String> operate = new LinkedList();
            Deque<Integer> in = new LinkedList();
                String tmp = s.nextLine();
                String[] p = tmp.split(" ");
                for (int i = 0; i < n; i++) {
                    if (p[i].equals("+")) {
                        operate.add(p[i]);
                    } else if (p[i].equals("-")) {
                        operate.add(p[i]);
                    } else if (p[i].equals("*")) {
                        operate.add(p[i]);
                    } else if (p[i].equals("/")) {
                        operate.add(p[i]);
                    } else {
                        in.add(Integer.parseInt(p[i]));
                    }

//                    if (!(p[i] == "+" || p[i] == "-" || p[i] == "/" || p[i] == "*")) {
//                    } else if ((p[i] == "+" || p[i] == "-" || p[i] == "/" || p[i] == "*")){
//                        operate.add(p[i]);
//                    }
                }
            System.out.println(cal(operate, in));
        }
    }

    private static int cal(Deque<String> operate, Deque<Integer> in) {
        int r = 0;
        String tmp = operate.pop();
        if (tmp.equals("+")) {
            r += in.pop() + in.pop();
        } else if (tmp.equals("-")) {
            r += in.pop() - in.pop();
        } else if (tmp.equals("*")) {
            r += in.pop() * in.pop();
        } else if (tmp.equals("/")) {
            r += in.pop() / in.pop();
        }
        while (!in.isEmpty()) {
            tmp = operate.pop();
            if (tmp.equals("+")) {
                r += in.pop();
            } else if (tmp.equals("-")) {
                r -= in.pop();
            } else if (tmp.equals("*")) {
                r *= in.pop();
            } else if (tmp.equals("/")) {
                r /= in.pop();
            }
        }
        return r;
    }
}
