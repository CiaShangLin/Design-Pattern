package Factory_Pattern.Product.CheckBoxUI

class WindowCheckBox : CheckBoxUI() {
    override fun check(state: Boolean) {
        print("WindowCheckBox $state\n")
    }
}