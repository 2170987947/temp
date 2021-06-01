package lession3;

public class 懒汉式多线程双重判断 {
    private static volatile 懒汉式多线程双重判断 instance = null;
    private 懒汉式多线程双重判断() {}
    public static 懒汉式多线程双重判断 getInstance() {
        if (instance == null) {
            synchronized (懒汉式多线程双重判断.class) {
                if (instance == null) {
                    instance = new 懒汉式多线程双重判断();
                }
            }
        }
        return instance;
    }
}
