package java0119;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/19 22:25
 */
// 实现方法 replace, 能够替换字符串中的某个部分
public class Replace {

    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "I oooo your!";
        Replace ex = new Replace();
        System.out.println("调用 String 类中的 replace 方法: " + str.replace("World", "nihao"));
        System.out.println("    自己写的 replace 方法:    " + myReplace(str, "World", "nihao"));
        System.out.println("调用 String 类中的 replace 方法: " + str1.replace("oo", "12"));
        System.out.println("    自己写的 replace 方法:    " + myReplace(str1, "oo", "12"));
    }

    public static String myReplace(String s1, String target, String replacement) {
        String result3 = "";
        // 表示追加字符串的次数
        int count3 = 0;
        // 记录下一次字符串的开始位置: 即这一次字符串结尾位置 + target的长度
        int start = 0;
        for (int i = 0; i <= s1.length() - target.length(); i++) {
            if (i >= start && i + target.length() <= s1.length() && target.equals(s1.substring(i, i + target.length()))) {
                if (count3 == 0) {
                    result3 += s1.substring(0, i) + replacement;
                    start = i + target.length();
                    count3++;
                } else {
                    result3 += s1.substring(start, i) + replacement;
                    start = i + target.length();
                }
            }
        }
        if (start < s1.length()) {
            result3 += s1.substring(start, s1.length());
        }
        return result3;
    }
}
