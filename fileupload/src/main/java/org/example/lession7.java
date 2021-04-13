package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/13 9:20
 */
public class lession7 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("你是谁?");
            }
        }).start();
        
        System.out.println("main 线程");
    }
}
