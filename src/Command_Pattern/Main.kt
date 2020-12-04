package Command_Pattern

import Command_Pattern.Commend.DownLightCommend
import Command_Pattern.Commend.OffLightCommend
import Command_Pattern.Commend.OnLightCommend
import Command_Pattern.Commend.UpLightCommend
import Command_Pattern.Invorker.PhoneInvoker
import Command_Pattern.Invorker.RemoteInvoker
import Command_Pattern.Receiver.DownReceiver
import Command_Pattern.Receiver.OffReceiver
import Command_Pattern.Receiver.OnReceiver
import Command_Pattern.Receiver.UpReceiver

fun main() {

    val onReceiver = OnReceiver()
    val offReceiver = OffReceiver()
    val onLightCommend = OnLightCommend(onReceiver)
    val offLightCommend = OffLightCommend(offReceiver)

    val remoteInvoker = RemoteInvoker(onLightCommend, offLightCommend)
    remoteInvoker.clickOn()
    remoteInvoker.clickOff()

    val upReceiver = UpReceiver()
    val downReceiver = DownReceiver()
    val upLightCommend = UpLightCommend(upReceiver)
    val downLightCommend = DownLightCommend(downReceiver)
    val phoneInvoker = PhoneInvoker(
        onLightCommend,
        offLightCommend,
        upLightCommend,
        downLightCommend
    )
    phoneInvoker.onClick()
    phoneInvoker.offClick()
    phoneInvoker.upClick()
    phoneInvoker.downClick()
}