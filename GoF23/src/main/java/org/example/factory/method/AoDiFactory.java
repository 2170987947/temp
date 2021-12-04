package org.example.factory.method;

public class AoDiFactory implements CarFactory {
    public Car getCar() {
        return new AoDi();
    }
}
