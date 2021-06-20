package test0611;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        while (in.hasNext()) {
            String a = in.next();
            int index = a.lastIndexOf("\\\\");
            String aa = a.substring(index + 1, a.length());
            if (aa.length() > 16) {
                aa = aa.substring(aa.length() - 16, aa.length());
            }
            int b = in.nextInt();
            int i = map.getOrDefault(aa, 0);
            map.put(aa, i + 1);
        }
        int start = 0;
        if (arr.size() > 8) {
            start = arr.size() - 8;
        }
        for (int i = start; i < arr.size(); i++) {
            System.out.printf("%s %d\n", arr.get(i), map.get(arr.get(i)));
        }
    }
}
