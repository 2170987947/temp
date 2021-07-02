package lession9;

public class Single {
    private static Single single = new Single();

    private Single() {

    }

    public static Single getInstance() {
        return single;
    }
}
