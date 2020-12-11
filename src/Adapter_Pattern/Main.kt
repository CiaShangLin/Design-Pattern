package Adapter_Pattern

import Adapter_Pattern.Adapter.ThreeToTwoPlugAdapter
import Adapter_Pattern.Plug.ThreePingPlug
import Adapter_Pattern.Plug.TwoPingPlug
import Adapter_Pattern.Socket.ThreePingPlugSocket
import Adapter_Pattern.Socket.TwoPingPlugSocket

fun main() {

    //3Ping插頭
    val threePingPlug = ThreePingPlug()
    threePingPlug.input()

    //插入3Ping插座
    val threePingPlugSocket = ThreePingPlugSocket(threePingPlug)
    threePingPlugSocket.returnPower()

    //2Ping插頭
    val twoPingPlug = TwoPingPlug()
    twoPingPlug.input()

    //插入2Ping插座
    var twoPingPlugSocket = TwoPingPlugSocket(twoPingPlug)
    twoPingPlugSocket.returnPower()

    //3Ping插頭插入2Ping轉接器
    val threeToTwoPlugAdapter = ThreeToTwoPlugAdapter(threePingPlug)
    threeToTwoPlugAdapter.input()

    //轉接器插入2Ping插座
    twoPingPlugSocket = TwoPingPlugSocket(threeToTwoPlugAdapter)
    twoPingPlugSocket.returnPower()
}