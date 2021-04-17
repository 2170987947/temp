package test0417;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 15:07
 */
public class ex5 {
    public static void main(String[] args) {
        System.out.println(StrToInt("+2147483647\n" +
                "    1a33"));
    }
    public static long StrToInt(String str) {
        long r = 0;
        char flag = '+';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c =='-')) {
                flag = c;
            } else if (c >= '0' && c <= '9') {
                r = r * 10 + (c - '0');
            } else {
                r = r * 10;
                break;
            }
        }
        if (flag == '-') {
            r *= (-1);
        }
        return r;
    }
}
