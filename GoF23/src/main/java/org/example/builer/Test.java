package org.example.builer;

public class Test {
    public static void main(String[] args) {
        // 指挥
        Director director = new Director();
        // 指挥具体工人完成产品
        Product build = director.build(new Worker());
        Product build2 = director.build(new Worker2());
        System.out.println(build.toString());
        System.out.println(build2.toString());
    }
}
