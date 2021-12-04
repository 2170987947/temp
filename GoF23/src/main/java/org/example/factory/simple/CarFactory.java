package org.example.factory.simple;

import org.example.factory.method.BenChi;
import org.example.factory.method.Car;
import org.example.factory.method.DaZhong;

// 简单工厂模式（静态工厂模式）
// 增加一个产品，不修改代码，是不可能的
public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("奔驰")) {
            return new BenChi();
        } else if (car.equals("大众")) {
            return new DaZhong();
        } else {
            return null;
        }
    }
}
