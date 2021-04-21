package java0119;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/19 23:31
 */
// 实现方法 contains, 能够判定字符串中是否包含子串
public class Contains {
    public static void main(String[] args) {
        String str = " Hello World";
        System.out.println("调用 String 类中的 isContains 方法: " + str.contains("World"));
        System.out.println("    自己写的 isContains 方法:    " + isContains(str,"World"));
        System.out.println("调用 String 类中的 isContains 方法: " + str.contains("dd"));
        System.out.println("    自己写的 isContains 方法:    " + isContains(str,"dd"));
    }

    public static boolean isContains(String str, String str1) {
        for (int i = 0; i < str.length(); i++) {
            if (i + str1.length() <= str.length() && str.substring(i,i + str1.length()).equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
