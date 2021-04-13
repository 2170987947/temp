package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:59
 */
public class MideaFactory implements AirFactory {
    public Air productAir() {
        return new MideaAir();
    }
}
