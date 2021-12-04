package org.example.factory.method;

public class Consumer {
    public static void main(String[] args) {
//        Car car1 = new BenChi();
//        Car car2 = new DaZhong();
//        car1.name();
//        car2.name();

//        Car car3 = CarFactory.getCar("奔驰");
//        Car car4 = CarFactory.getCar("大众");
//        car3.name();
//        car4.name();

        Car car5 = new JiLiFactory().getCar();

    }
}
