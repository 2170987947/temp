package java0117;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/17 9:41
 */
public class Atoa {
    public static void main(String[] args) {

        String str = "ABC";
        System.out.println(str.length());
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            str1[i] += 32;
        }
        System.out.println(str1);

    }
}
