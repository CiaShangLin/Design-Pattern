package Adapter_Pattern.Plug

import Adapter_Pattern.Plug.IPlug

class TwoPingPlug: IPlug {
    override fun input() {
        println("TwoPingPlug input")
    }

    override fun getPower(power: String) {
        println("TwoPingPlug getPower $power")
    }
}