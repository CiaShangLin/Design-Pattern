package Factory_Pattern

import Factory_Pattern.Factory.LinuxFactory
import Factory_Pattern.Factory.MacFactory
import Factory_Pattern.Factory.WindowFactory

fun main() {
    val mac = MacFactory()
    val window = WindowFactory()
    val linux = LinuxFactory()

    mac.getButtonUI().click()
    mac.getCheckBoxUI().check(true)

    window.getButtonUI().click()
    window.getCheckBoxUI().check(true)

    linux.getButtonUI().click()
    linux.getCheckBoxUI().check(false)
}