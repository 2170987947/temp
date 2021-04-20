package org.example;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/20 19:28
 */
public class ImageReadFactoryTest {
    @Test
    public void main() {
        try {
            ImageReadFactory imageReadFactory = (ImageReadFactory) XMLUtil.getBean();
            imageReadFactory.createImageReader().readImage();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
