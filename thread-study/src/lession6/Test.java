package lession6;

public class Test {
    public static void main(String[] args) {
        String s = new StringBuffer("计算机").append("软件").toString();
//        System.out.println("计算机软件" == s);
//        System.out.println(s.intern() == s);
        System.out.println(s == "计算机软件");
//        System.out.println(s.intern() == s);
    }
}
