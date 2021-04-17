package test0417;


/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 14:00
 */
public class ex3 {
    public static void main(String[] args) {
//        int num = 10;
//        System.out.println(test(num));
        boolean b = true ? false : true == true ? false : true;
        System.out.println(b);
    }

    private static int test(int i) {
        try {
            i += 10;
            return i;
        } catch (RuntimeException e) {
        } catch (Exception e) {
        } finally {
            i += 10;
            return i;
        }
    }
}
