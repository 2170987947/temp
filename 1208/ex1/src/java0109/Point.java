package java0109;

public class Point {
    public int x = 0;
    public int y = 0;

    {
        x = 10;
        y = 0;
        System.out.println("Hello");
    }
    public Point() {
        x = 100;
        y = 0;
    }
    public Point(int x) {
        this.x = x;
    }
    public Point(int x, int y) {
        this(x);
        this.y = y;

    }
}
