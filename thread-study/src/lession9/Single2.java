package lession9;

public class Single2 {
    private static Single2 single2;
    private Single2() {
    }

    public static Single2 getInstance() {
        if (single2 == null) {
            single2 = new Single2();
        }
        return single2;
    }
}
