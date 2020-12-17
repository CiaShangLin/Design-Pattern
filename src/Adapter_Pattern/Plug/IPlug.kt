package Adapter_Pattern.Plug

import Adapter_Pattern.Socket.IThreePlugSocKet
import Adapter_Pattern.Socket.ITwoPlugSocKet

interface IPlug {
    fun getPower(): String
}

interface IThreePlug : IPlug {
    fun insertSocket(socket: IThreePlugSocKet)
}

interface ITwoPlug : IPlug {
    fun insertSocket(socket: ITwoPlugSocKet)
}
