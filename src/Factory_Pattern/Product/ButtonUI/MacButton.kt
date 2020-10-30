package Factory_Pattern.Product.ButtonUI

class MacButton : ButtonUI() {
    override fun click() {
        print("MacButton Click\n")
    }
}