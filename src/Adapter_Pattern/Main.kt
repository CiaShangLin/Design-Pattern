package Adapter_Pattern

import Adapter_Pattern.Adapter.TwoToThreeSocketAdapter
import Adapter_Pattern.Plug.ThreePingPlug
import Adapter_Pattern.Plug.TwoPingPlug
import Adapter_Pattern.Socket.ThreePingPlugSocket
import Adapter_Pattern.Socket.TwoPingPlugSocket

fun main() {

    //3Ping插頭
    val threePingPlug = ThreePingPlug()
    val threePingPlugSocket = ThreePingPlugSocket()
    println(threePingPlug.getPower())
    threePingPlug.insertSocket(threePingPlugSocket)
    println(threePingPlug.getPower())


    //2Ping插頭
    val twoPingPlug = TwoPingPlug()
    val twoPingPlugSocket = TwoPingPlugSocket()
    println(twoPingPlug.getPower())
    twoPingPlug.insertSocket(twoPingPlugSocket)
    println(twoPingPlug.getPower())

    //轉接器
    val twoToThreeSocketAdapter = TwoToThreeSocketAdapter(twoPingPlugSocket)
    threePingPlug.insertSocket(twoToThreeSocketAdapter)
    println(threePingPlug.getPower())

}