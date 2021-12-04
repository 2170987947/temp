package org.example.builer;

public class Worker extends Builer {

    private Product product;

    public Worker() {
        product = new Product();
    }

    void builder1() {
        product.setBuiler1("地基");
        System.out.println("地基");
    }

    void builder2() {
        product.setBuiler2("钢筋工程");
        System.out.println("钢筋工程");
    }

    void builder3() {
        product.setBuiler3("铺电线");
        System.out.println("铺电线");
    }

    void builder4() {
        product.setBuiler4("粉刷");
        System.out.println("粉刷");
    }

    Product getProduct() {
        return product;
    }
}
