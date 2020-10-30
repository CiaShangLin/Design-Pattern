package Factory_Pattern.Product.CheckBoxUI

class LinuxCheckBox : CheckBoxUI() {
    override fun check(state: Boolean) {
        print("LinuxCheckBox $state\n")
    }
}