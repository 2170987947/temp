package org.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 14:16
 */
public class TreadLook2 {
    public static void main(String[] args) {
        Thread t = new Thread("main 中的子线程") {
            @Override
            public void run() {
                while (true) {

                }
            }
        };
//        t.setDaemon(true);
        // 线程要启动,
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority()); // 0-10
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon()); // 守护线程, 后台进程
        System.out.println(t.isInterrupted());
    }
}
