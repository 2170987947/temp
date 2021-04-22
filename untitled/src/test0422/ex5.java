package test0422;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 15:45
 */
public class ex5 {
    public static void main(String[] args) {

    }

    public int StrToInt(String str) {
        int r = 0;
        int flag = 1;
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (i == 0 && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                while (i < str.length() && (c == '+' || c == '-')) {
                    if (c == '-') {
                        flag *= -1;
                    }
                    i++;
                    if (i < str.length()) {
                        c = str.charAt(i);
                    } else {
                        return 0;
                    }
                }
            }
            if (c >= '0' && c <= '9') {
                r = r * 10 + (c - '0');
            } else {
                return 0;
            }
            i++;
        }
        return flag * r;
    }
}
