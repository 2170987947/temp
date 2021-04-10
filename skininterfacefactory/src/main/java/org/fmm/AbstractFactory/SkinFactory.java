package org.fmm.AbstractFactory;


import org.fmm.AbstactProduct.Button;
import org.fmm.AbstactProduct.ComboBox;
import org.fmm.AbstactProduct.TextField;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 11:51
 */
public interface SkinFactory {
    public Button createButton();
    public ComboBox createComboBox();
    public TextField createTextField();
}
