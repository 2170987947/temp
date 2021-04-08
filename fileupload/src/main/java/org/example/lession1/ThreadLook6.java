package org.example.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 14:51
 */
public class ThreadLook6 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunable());
    }
}
