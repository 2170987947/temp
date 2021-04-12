import java.util.*;
public class Test {
    public static ArrayList<Character> toList(String a) {
        ArrayList<Character> b = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            b.add(a.charAt(i));
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        ArrayList s1 = toList(str1);
        ArrayList s2 = toList(str2);
        for (int i = 0; i < str2.length(); i++) {
            while (s1.contains(str2.charAt(i))) {
                s1.remove((Character)str2.charAt(i));
            }
        }
        String result = new String();
        for (int i = 0; i < s1.size(); i++) {
            result += s1.get(i);
        }
        System.out.println(result);
    }
}