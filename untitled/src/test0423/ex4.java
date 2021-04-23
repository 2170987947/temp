package test0423;

import java.util.AbstractSet;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 13:48
 */
public class ex4 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                pong();
            }
        });
        t.run();
        System.out.println("ping");
    }

    private static void pong() {
        System.out.println("pong");
    }
}
