package org.example.factory.method;

public class JiLiFactory implements CarFactory {
    public Car getCar() {
        return new JiLi();
    }
}
