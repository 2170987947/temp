package org.example;


/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:13
 */
public class JpgReaderFactory implements ImageReadFactory {
    public ImageReader createImageReadeer() {
        JpgReader jpgReader = new JpgReader();
        return jpgReader;
    }
}
