package Adapter_Pattern.Plug

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.ITwoPlugSocKet

class TwoPingPlug : ITwoPlug {
    private var mITwoPlugSocKet: ITwoPlugSocKet? = null

    override fun insertSocket(socket: ITwoPlugSocKet) {
        mITwoPlugSocKet = socket
    }

    override fun getPower(): String {
        return "TwoPingPlug getPower ${mITwoPlugSocKet?.returnPower()}"
    }
}