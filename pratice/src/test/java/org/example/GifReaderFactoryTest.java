package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 10:04
 */
public class GifReaderFactoryTest {
    @Test
    public void main() {
        ImageReadFactory imageReadFactory = new GifReaderFactory();
        Assert.assertNotNull(imageReadFactory.createImageReadeer());
    }
}
