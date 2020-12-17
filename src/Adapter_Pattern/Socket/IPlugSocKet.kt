package Adapter_Pattern.Socket

interface IPlugSocKet {
    fun returnPower(): String
}

interface IThreePlugSocKet : IPlugSocKet

interface ITwoPlugSocKet : IPlugSocKet