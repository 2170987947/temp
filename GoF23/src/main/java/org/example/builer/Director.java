package org.example.builer;

// 指挥：核心， 负责指挥构建一个工程，工程如何构建，由它决定
public class Director {

    // 指挥工人按照顺序建房子
    public Product build(Builer builer) {
        builer.builder1();
        builer.builder2();
        builer.builder3();
        builer.builder4();
        return builer.getProduct();
    }
}
