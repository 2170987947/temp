package test0619;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zimu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shuzi= "22233344455566677778889999";
        Map<Character, Character> map = new HashMap<>();
        char[] a = zimu.toCharArray();
        char[] b = shuzi.toCharArray();
        for (int i = 0; i < 26; i++) {
            map.put(a[i], b[i]);
        }
        while (s.hasNextInt()) {
            int n = s.nextInt();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String line = s.next();
                if (!isConrrect(line)) {
                    continue;
                }
                char[] l = line.toCharArray();
                StringBuffer r = new StringBuffer();
                for (int j = 0; j < l.length; j++) {
                    char tmp = l[j];
                    if (r.length() == 3) {
                        r.append('-');
                    }
                    if (tmp != '-' && tmp >= '0' && tmp <= '9') {
                        r.append(tmp);
                    } else if (tmp != '-') {
                        r.append(map.get(tmp));
                    }
                }
                if (r.length() != 8) {
                    continue;
                }
                set.add(r.toString());
            }
            printPhone(set);
            System.out.println();
        }
    }

    private static void printPhone(Set<String> set) {
        String[] r = new String[set.size()];
        int i = 0;
        for (String s : set) {
            r[i++] = s;
        }
        Arrays.sort(r);
        for (int j = 0; j < r.length; j++) {
            System.out.println(r[j]);
        }
    }

    private static boolean isConrrect(String line) {
        return line.length() >= 7;
    }
}