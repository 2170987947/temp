package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/8 20:00
 */
public class Main {
    public static void main(String[] args) {
        ImageReadFactory imageReaderFactory = null;
        ImageReader imageReader;
        try {
            imageReaderFactory = (ImageReadFactory) XMLUtil.getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }
        imageReader = imageReaderFactory.createImageReadeer();
        imageReader.readImage();
    }
}
