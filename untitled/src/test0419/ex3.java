package test0419;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/19 19:20
 */
public class ex3 {
    static int i = 6;
    static {
        i += 9;
    }

    public static void main(String[] args) {
        System.out.println(i);
        for (char c : "ased".toCharArray()) {
            break;
        }
    }
    static {
        i /= 3;
    }
}
