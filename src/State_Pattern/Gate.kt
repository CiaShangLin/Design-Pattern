package State_Pattern

class Gate {
    private var mGateState: GateState = CloseGateState(this)

    fun enter() {
        mGateState.enter()
    }

    fun pay(password:String) {
        mGateState.pay(password)
    }

    fun changeGateState(gateState: GateState) {
        mGateState = gateState
    }
}