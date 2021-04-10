package org.fmm.ConcreteFactroy;

import org.fmm.AbstactProduct.Button;
import org.fmm.AbstactProduct.ComboBox;
import org.fmm.AbstactProduct.TextField;
import org.fmm.AbstractFactory.SkinFactory;
import org.fmm.ConcreteProduct.SpringButton;
import org.fmm.ConcreteProduct.SpringComboBox;
import org.fmm.ConcreteProduct.SpringTextField;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 11:53
 */
public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }
}
