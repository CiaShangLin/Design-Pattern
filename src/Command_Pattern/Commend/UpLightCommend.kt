package Command_Pattern.Commend

import Command_Pattern.Receiver.UpReceiver

class UpLightCommend(private val mUpReceiver: UpReceiver): ICommend {
    override fun execute() {
        mUpReceiver.action()
    }

    override fun unExecute() {

    }
}