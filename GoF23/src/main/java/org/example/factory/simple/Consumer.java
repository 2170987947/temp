package org.example.factory.simple;

import org.example.factory.method.Car;

// 结构复杂度： simple
// 代码复杂度： simple
// 编程复杂度： simple
// 管理复杂度： simple
// 根据设计原则：工厂方法模式
// 根据实际业务：简单工厂模式
public class Consumer {
    public static void main(String[] args) {
//        Car car1 = new BenChi();
//        Car car2 = new DaZhong();
//        car1.name();
//        car2.name();

        Car car3 = CarFactory.getCar("奔驰");
        Car car4 = CarFactory.getCar("大众");
        car3.name();
        car4.name();
    }
}
