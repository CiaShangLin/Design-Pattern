package Factory_Pattern.Factory

import Factory_Pattern.Product.ButtonUI.ButtonUI
import Factory_Pattern.Product.ButtonUI.MacButton
import Factory_Pattern.Product.CheckBoxUI.CheckBoxUI
import Factory_Pattern.Product.CheckBoxUI.MacCheckBox

class MacFactory : UiFactory() {
    override fun getButtonUI(): ButtonUI = MacButton()

    override fun getCheckBoxUI(): CheckBoxUI = MacCheckBox()
}