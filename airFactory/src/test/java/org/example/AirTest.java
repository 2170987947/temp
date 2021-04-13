package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/13 11:32
 */
public class AirTest {
    @Test
    public void main() {
        AirFactory airFactory = new MideaFactory();
        Assert.assertNotNull(airFactory.productAir());
    }
}

