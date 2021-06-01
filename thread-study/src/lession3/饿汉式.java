package lession3;

public class 饿汉式 {
    private static 饿汉式 sheJiMoShi1 = new 饿汉式();
    private 饿汉式() {}
    public static 饿汉式 getInstance() {
        return sheJiMoShi1;
    }
}
