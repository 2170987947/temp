package test0426;

import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        List<String> list = new LinkedList<>();
        int start = 0;
        int end = 0;
        int i = 0;

        while (i < str.length()) {
            boolean flag = false;
            if (str.charAt(i) == '\"') {
                i++;
                start = i;
            }
            while (i < str.length() && str.charAt(i) != ' ') {
                if (start > 0 && str.charAt(start - 1) == '\"' && str.charAt(i) == '\"') {
                    end = i;
                    flag = true;
                }
                i++;
            }
            if (flag == false) {
                end = i;
            }
            list.add(str.substring(start, end));
            i++;
            start = i;
        }
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}