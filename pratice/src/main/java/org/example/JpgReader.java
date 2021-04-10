package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:21
 */
public class JpgReader extends ImageReader {
    @Override
    public void readImage() {
        System.out.println("通过 JpgReader 读取图片");
    }
}
