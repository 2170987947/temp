package lession3;

public class 懒汉式多线程 {
    private static 懒汉式多线程 instance = null;
    private 懒汉式多线程() {}
    public synchronized static 懒汉式多线程 getInstance() {
        if (instance == null) {
            instance = new 懒汉式多线程();
        }
        return instance;
    }
}
