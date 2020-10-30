package Factory_Pattern.Factory

import Factory_Pattern.Product.ButtonUI.ButtonUI
import Factory_Pattern.Product.ButtonUI.LinuxButton
import Factory_Pattern.Product.CheckBoxUI.CheckBoxUI
import Factory_Pattern.Product.CheckBoxUI.LinuxCheckBox

class LinuxFactory : UiFactory() {
    override fun getButtonUI(): ButtonUI = LinuxButton()

    override fun getCheckBoxUI(): CheckBoxUI = LinuxCheckBox()
}