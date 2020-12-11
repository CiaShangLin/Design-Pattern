package Adapter_Pattern.Socket

import Adapter_Pattern.Plug.IPlug
import Adapter_Pattern.Socket.IPlugSocKet

class TwoPingPlugSocket(private val twoPingPlug: IPlug): IPlugSocKet {
    override fun returnPower() {
        twoPingPlug.getPower("110V")
    }
}