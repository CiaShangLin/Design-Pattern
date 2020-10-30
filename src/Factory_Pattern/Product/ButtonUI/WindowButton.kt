package Factory_Pattern.Product.ButtonUI

class WindowButton : ButtonUI() {
    override fun click() {
        print("WindowButton Click\n")
    }
}