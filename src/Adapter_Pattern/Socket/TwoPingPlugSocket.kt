package Adapter_Pattern.Socket

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.IPlugSocKet

class TwoPingPlugSocket : ITwoPlugSocKet {
    override fun returnPower() = "110V"
}