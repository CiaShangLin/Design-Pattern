package Factory_Pattern.Factory

import Factory_Pattern.Product.ButtonUI.ButtonUI
import Factory_Pattern.Product.ButtonUI.WindowButton
import Factory_Pattern.Product.CheckBoxUI.CheckBoxUI
import Factory_Pattern.Product.CheckBoxUI.WindowCheckBox

class WindowFactory : UiFactory() {
    override fun getButtonUI(): ButtonUI = WindowButton()

    override fun getCheckBoxUI(): CheckBoxUI = WindowCheckBox()
}