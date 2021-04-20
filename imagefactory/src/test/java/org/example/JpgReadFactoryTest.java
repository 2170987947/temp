package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 10:08
 */
public class JpgReadFactoryTest {
    @Test
    public void main() {
        ImageReadFactory imageReadFactory = new JpgReaderFactory();
        imageReadFactory.createImageReader().readImage();
        Assert.assertNotNull(imageReadFactory.createImageReader());
    }
}
