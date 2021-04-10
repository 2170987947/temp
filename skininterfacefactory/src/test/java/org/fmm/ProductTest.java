package org.fmm;

import org.fmm.AbstractFactory.SkinFactory;
import org.fmm.util.XMLUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 12:26
 */
public class ProductTest {
    @Test
    public void Test() {
        SkinFactory skinFactory = (SkinFactory)XMLUtil.getBean();
        Assert.assertNotNull(skinFactory.createButton());
        skinFactory.createButton().display();
        Assert.assertNotNull(skinFactory.createComboBox());
        skinFactory.createComboBox().display();
        Assert.assertNotNull(skinFactory.createTextField());
        skinFactory.createTextField().display();
    }
}
