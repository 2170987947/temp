package test0608;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            Set<String> set = new HashSet<>();
            int r = 0;
            for (int i = 0; i < n; i++) {
                String id = s.next();
                String record = s.next();
                if (record.equals("connect")) {
                    set.add(id);
                } else {
                    set.remove(id);
                }
                r = Math.max(r, set.size());
            }
            System.out.println(r);
        }
    }
}
