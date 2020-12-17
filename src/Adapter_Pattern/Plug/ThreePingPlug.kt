package Adapter_Pattern.Plug

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.IThreePlugSocKet

class ThreePingPlug : IThreePlug {
    private var mIThreePlugSocKet: IThreePlugSocKet? = null

    override fun insertSocket(socket: IThreePlugSocKet) {
        mIThreePlugSocKet = socket
    }

    override fun getPower(): String {
        return "ThreePingPlug getPower ${mIThreePlugSocKet?.returnPower()}"
    }
}