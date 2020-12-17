package Adapter_Pattern.Adapter

import Adapter_Pattern.Socket.IThreePlugSocKet
import Adapter_Pattern.Socket.TwoPingPlugSocket

class TwoToThreeSocketAdapter(private val twoPingPlugSocket: TwoPingPlugSocket) : IThreePlugSocKet {
    override fun returnPower(): String {
        return twoPingPlugSocket.returnPower()
    }
}