package Factory_Pattern.Product.ButtonUI

class LinuxButton : ButtonUI() {
    override fun click() {
        print("LinuxButton Click\n")
    }
}