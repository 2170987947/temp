package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 19:05
 */
public class ex6 {
    public static void main(String[] args) {
        Object o = new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
