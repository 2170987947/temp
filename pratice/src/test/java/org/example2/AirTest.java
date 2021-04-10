package org.example2;

import org.example1.AirFactory;
import org.example1.MideaFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 10:13
 */
public class AirTest {
    @Test
    public void main() {
        AirFactory airFactory = new MideaFactory();
        Assert.assertNotNull(airFactory.productAir());
    }
}
