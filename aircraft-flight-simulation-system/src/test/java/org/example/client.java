package org.example;

import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:17
 */
public class client {
    @Test
    public void helicpter() {
        AirCraft helicpter = new Helicpter();
        helicpter.takeOff();
        helicpter.fly();
    }
    @Test
    public void fighter() {
        AirCraft fighter = new Fighter();
        fighter.takeOff();
        fighter.fly();
    }
    @Test
    public void harrier() {
        AirCraft harrier = new Harrier();
        harrier.takeOff();
        harrier.fly();
    }
    @Test
    public void airPlane() {
        AirCraft airPlane = new AirPlane();
        System.out.println(airPlane.getClass());
        airPlane.takeOff();
        airPlane.fly();
    }
}
