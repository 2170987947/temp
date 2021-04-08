package org.example.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 14:38
 */
public class ThreadLook4 {

    public static void main(String[] args) {
        // 同时启动 20 个线程, 每个线程从 0 一直不断 + 1, 到9999
        Thread t = null;
        for (int i = 0; i < 20; i++) {
            t = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        if (i == 9999) {
                            System.out.println(i);
                        }
                    }
                }
            };
            t.start();
        }
    }
}
