package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:04
 */
public class Fighter extends AirCraft {
    public Fighter() {
        flyBehavior = new SuperSonicFly();
        takeOffBehavior = new LongDistanceTakeOff();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        takeOffBehavior.takeOff();
    }
}
