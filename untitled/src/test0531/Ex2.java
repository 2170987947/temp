package test0531;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            Set<String> set = new HashSet<>();
            int n = s.nextInt();
            s.nextLine();
            String a = s.nextLine();
            String[] p = a.split("/");
            if (set.contains(a))
            set.add(a);
        }
    }
}
