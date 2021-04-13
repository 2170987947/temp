package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 15:01
 */
public class Client {
    public static void main(String[] args) {
        Air a;
        AirFactory factory = new HaierFactory();
        a = factory.productAir();
        a.produced();
    }
}
