package State_Pattern

interface GateState {
    fun enter()
    fun pay(password:String)
    fun payOn()
    fun payFailed()
}