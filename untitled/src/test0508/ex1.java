package test0508;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/8 18:19
 */
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(pipei(a, b));
        }
    }

    private static boolean pipei(String a, String b) {
        int j = 0;
        int i = 0;
        while (j < b.length() && i < a.length()) {
            if (a.charAt(i) == '?' || a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else if (a.charAt(i) == '*') {
                i++;
                if (i >= a.length()) {
                    return true;
                } else {
                    while (j < b.length() && a.charAt(i) != b.charAt(j)) {
                        j++;
                    }
                    if (a.charAt(i) == b.charAt(j)) {
                        i++;
                        j++;
                    } else {
                        while (i < a.length()) {
                            if (a.charAt(i) == '?' || a.charAt(i) == '*') {
                                i++;
                            } else {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            } else if (j < b.length() && a.charAt(i) != b.charAt(j)) {
                return false;
            }
            if (i == a.length() && j == b.length()) {
                return true;
            }
        }
        return false;
    }
}
