package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:56
 */
public class HaierFactory implements AirFactory {

    @Override
    public Air productAir() {
        return new HaierAir();
    }
}
