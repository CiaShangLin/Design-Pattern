package Adapter_Pattern.Plug

import Adapter_Pattern.Plug.IPlug

class ThreePingPlug : IPlug {
    override fun input() {
        println("ThreePingPlug input")
    }

    override fun getPower(power: String) {
        println("ThreePingPlug getPower $power")
    }
}