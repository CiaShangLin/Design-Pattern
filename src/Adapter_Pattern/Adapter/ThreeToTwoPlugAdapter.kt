package Adapter_Pattern.Adapter

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Plug.ThreePingPlug
import Adapter_Pattern.Plug.TwoPingPlug

class ThreeToTwoPlugAdapter(private val mThreePingPlug: ThreePingPlug) : IPlug {
    private val mTwoPingPlug = TwoPingPlug()
    override fun input() {
        mTwoPingPlug.input()
    }

    override fun getPower(power: String) {
        mTwoPingPlug.getPower(power)
    }
}