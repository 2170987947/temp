package org.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 14:49
 */
public class ThreadLook5 {

    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    if (i == 20) {
                        // 某个线程出现异常, 如果抛到 run 方法,
                        // 整个线程直接终止, 但是不会影响其他进程
                        // 线程中, 处理异常的方式: 线程对象, setUncaughtExceptionHandler()
                        // 或者自己在 run 捕获并处理
                        throw new RuntimeException();
                    }
                    System.out.println(i);
                }
            }
        };
        t.start();
        while (true) {

        }
    }
}
