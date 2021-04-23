package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:03
 */
public class AirPlane extends AirCraft {
    public AirPlane() {
        flyBehavior = new SubSonicFly();
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
