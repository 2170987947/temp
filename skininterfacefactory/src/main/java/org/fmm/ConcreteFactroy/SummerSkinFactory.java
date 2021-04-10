package org.fmm.ConcreteFactroy;

import org.fmm.AbstactProduct.Button;
import org.fmm.AbstactProduct.ComboBox;
import org.fmm.AbstactProduct.TextField;
import org.fmm.AbstractFactory.SkinFactory;
import org.fmm.ConcreteProduct.SummerButton;
import org.fmm.ConcreteProduct.SummerComboBox;
import org.fmm.ConcreteProduct.SummerTextField;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 11:54
 */
public class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }
}
