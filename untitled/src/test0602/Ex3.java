package test0602;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String line = s.nextLine();
            String a = s.nextLine();
            Set<String> set = new HashSet<>();
            int start = 0;
            int end = 0;
            while (start < line.length()) {
                if ('\"' == line.charAt(start)) {
                    end = line.indexOf('\"', start + 1);
                    set.add(line.substring(start + 1, end));
                    start = end + 2;
                } else {
                    end = line.indexOf(',', start + 1);
                    if (end == -1) {
                        set.add(line.substring(start, line.length()));
                        break;
                    }
                    start = end + 1;
                }
            }
            if (set.contains(a)) {
                System.out.println("Ignore");
            } else {
                System.out.println("Important!");
            }
        }
    }
}
