package org.fmm;

import org.fmm.AbstactProduct.Button;
import org.fmm.AbstactProduct.ComboBox;
import org.fmm.AbstactProduct.TextField;
import org.fmm.AbstractFactory.SkinFactory;
import org.fmm.util.XMLUtil;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/13 9:04
 */
class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
