package Factory_Pattern.Product.CheckBoxUI

class MacCheckBox : CheckBoxUI() {
    override fun check(state: Boolean) {
        print("MacCheckBox $state\n")
    }
}