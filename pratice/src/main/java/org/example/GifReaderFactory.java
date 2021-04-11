package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:09
 */
public class GifReaderFactory implements ImageReadFactory {

    public GifReader createImageReadeer() {
        GifReader gifReader = new GifReader();
        return gifReader;
    }

}
