package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/9 14:25
 */
public class XMLUtil {
    public static Object getBean() throws IOException, SAXException, ParserConfigurationException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("config.xml"));
        NodeList nodeList = document.getElementsByTagName("image");
        Node imageTypeNode = nodeList.item(0).getFirstChild();
        String image = imageTypeNode.getNodeValue().trim();
        Class clazz = Class.forName(image);
        Object object = clazz.newInstance();
        return object;
    }
}
