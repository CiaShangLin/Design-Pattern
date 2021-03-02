package State_Pattern

class CloseGateState(private val gate: Gate) : GateState {
    override fun enter() {
        println("Gate is close state")
    }

    override fun pay(password: String) {
        println("CloseGateState pay")
        if (password == "906906") {
            payOn()
        } else {
            payFailed()
        }
    }

    override fun payOn() {
        println("CloseGateState payOn")
        gate.changeGateState(OpenGateState(gate))
    }

    override fun payFailed() {
        println("CloseGateState payFailed")
    }
}