package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:18
 */
public class GifReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("通过 GifReader 读取图片");
    }
}
