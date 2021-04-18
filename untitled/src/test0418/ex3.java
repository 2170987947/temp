package test0418;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/18 19:17
 */
public class ex3 {
    private static int i = 100;
    public static void main(String[] args) {
        ex3 ex32 = new ex3();
        ex32.i++;
        ex3 ex31 = new ex3();
        ex31.i++;
        ex32 = new ex3();
        ex32.i++;
        ex3.i--;
        System.out.println(i);
        System.out.println(Math.round(11.5));
    }
}
