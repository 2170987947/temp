package org.example.builer;

// 产品：房子
public class Product {

    private String builer1;
    private String builer2;

    public String getBuiler1() {
        return builer1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "builer1='" + builer1 + '\'' +
                ", builer2='" + builer2 + '\'' +
                ", builer3='" + builer3 + '\'' +
                ", builer4='" + builer4 + '\'' +
                '}';
    }

    public void setBuiler1(String builer1) {
        this.builer1 = builer1;
    }

    public String getBuiler2() {
        return builer2;
    }

    public void setBuiler2(String builer2) {
        this.builer2 = builer2;
    }

    public String getBuiler3() {
        return builer3;
    }

    public void setBuiler3(String builer3) {
        this.builer3 = builer3;
    }

    public String getBuiler4() {
        return builer4;
    }

    public void setBuiler4(String builer4) {
        this.builer4 = builer4;
    }

    private String builer3;
    private String builer4;
}
