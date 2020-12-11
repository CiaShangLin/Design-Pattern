package Adapter_Pattern.Socket

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.IPlugSocKet

class ThreePingPlugSocket(private val threePingPlug: IPlug) : IPlugSocKet {
    override fun returnPower() {
        threePingPlug.getPower("220V")
    }
}