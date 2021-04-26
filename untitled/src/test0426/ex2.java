package test0426;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/26 19:17
 */
public class ex2 {
    public static void main(String[] args) {
        String str = "abc" + "ed";
        String str2 = new String(str);
        if (str.equals(str2)) {
            System.out.println("kkk");
        }
        if (str == str2) {
            System.out.println("ppp");
        }
    }
}
