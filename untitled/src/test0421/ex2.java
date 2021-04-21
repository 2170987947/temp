package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 13:00
 */
public class ex2 {
    public static void main(String[] args) {
//        ex2 n = null;
//        n.testMethod();
//        int i = 0;
//        Integer j = new Integer(0);
//        System.out.println(i == j);
//        System.out.println(j.equals(i));
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f', 'F');
        y = y + "wxy";
        System.out.println(y);
    }

    private void testMethod() {
        System.out.println("testMethod");
    }
}
