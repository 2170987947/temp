package lession9;

public class Single3 {
    private static volatile Single3 single3;
    private Single3() {
    }
    public static Single3 getInstance() {
        if (single3 == null) {
            synchronized (Single.class) {
                if (single3 == null) {
                    single3 = new Single3();
                }
            }
        }
        return single3;
    }
}
