package Factory_Pattern.Factory

import Factory_Pattern.Product.ButtonUI.ButtonUI
import Factory_Pattern.Product.CheckBoxUI.CheckBoxUI

abstract class UiFactory {
    abstract fun getButtonUI(): ButtonUI
    abstract fun getCheckBoxUI(): CheckBoxUI
}