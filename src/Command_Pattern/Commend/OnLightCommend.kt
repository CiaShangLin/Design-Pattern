package Command_Pattern.Commend

import Command_Pattern.Receiver.OnReceiver

class OnLightCommend(private val mOnReceiver: OnReceiver) : ICommend {


    override fun execute() {
        mOnReceiver.action()
    }

    override fun unExecute() {

    }
}