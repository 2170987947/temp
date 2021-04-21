package java0119;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/19 23:24
 */
// 实现方法 indexOf, 能够找出字符串子串存在的位置
public class IndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("调用 String 类中的 indexOf 方法: " + str.indexOf("World"));
        System.out.println("    自己写的 indexOf 方法:    " + myIndexOf(str,"World"));
    }

    public static int myIndexOf(String str, String str1) {
        if (str1 == null) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i + str1.length() <= str.length() && str.substring(i,i + str1.length()).equals(str1)) {
                return i;
            }
        }
        return -1;
    }
}
