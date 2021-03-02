package State_Pattern

class OpenGateState(private val gate: Gate) : GateState {
    override fun enter() {
        println("Gate is open enter")
    }

    override fun pay(password: String) {
        println("Gate is opening")
        payOn()
    }

    override fun payOn() {
        println("OpenGateState payOn")
        gate.changeGateState(CloseGateState(gate))
    }

    override fun payFailed() {
        println("OpenGateState payFailed")
    }

}