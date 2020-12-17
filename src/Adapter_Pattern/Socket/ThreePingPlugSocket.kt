package Adapter_Pattern.Socket

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.IPlugSocKet

class ThreePingPlugSocket : IThreePlugSocKet {
    override fun returnPower() = "220V"
}