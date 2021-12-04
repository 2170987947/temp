package org.example.builer;

public class Worker2 extends Builer {

    private Product product;

    public Worker2() {
        product = new Product();
    }

    void builder1() {
        product.setBuiler1("地基2");
        System.out.println("地基2");
    }

    void builder2() {
        product.setBuiler2("钢筋工程2");
        System.out.println("钢筋工程2");
    }

    void builder3() {
        product.setBuiler3("铺电线2");
        System.out.println("铺电线2");
    }

    void builder4() {
        product.setBuiler4("粉刷2");
        System.out.println("粉刷2");
    }

    Product getProduct() {
        return product;
    }
}
