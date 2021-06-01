package lession3;

public class 懒汉式单线程 {
    private static 懒汉式单线程 instance = null;
    private 懒汉式单线程() {}
    public static 懒汉式单线程 getInstance() {
        if (instance == null) {
            instance = new 懒汉式单线程();
        }
        return instance;
    }
}
