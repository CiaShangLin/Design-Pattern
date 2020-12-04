package Command_Pattern.Commend

import Command_Pattern.Receiver.OffReceiver

class OffLightCommend(private val mOffReceiver: OffReceiver) : ICommend {
    override fun execute() {
        mOffReceiver.action()
    }

    override fun unExecute() {

    }
}