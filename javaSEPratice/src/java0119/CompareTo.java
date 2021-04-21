package java0119;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/19 23:31
 */
// 实现方法 compareTo, 能够实现按照字典序比较字符串大小
public class CompareTo {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello1";
        System.out.println("调用 String 类中的 myCompareTo 方法: " + a.compareTo(b));
        System.out.println("    自己写的 myCompareTo 方法:    " + myCompareTo(a, b));
    }

    public static int myCompareTo(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int i = 0;
        for (i = 0; i < a.length() && i < b.length(); i++) {
            if (a1[i] == b1[i]) {
                continue;
            }else {
                return a1[i] - b1[i];
            }
        }
        if (a.length() == b.length()) {
            return 0;
        }else if (a.length() < b.length()) {
            return -1;
        }else {
            return 1;
        }
    }
}
