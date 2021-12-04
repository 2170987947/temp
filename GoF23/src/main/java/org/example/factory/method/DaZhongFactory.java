package org.example.factory.method;

public class DaZhongFactory implements CarFactory {
    public Car getCar() {
        return new DaZhong();
    }
}
