package Command_Pattern.Commend

import Command_Pattern.Receiver.DownReceiver

class DownLightCommend(private val mDownReceiver: DownReceiver):
    ICommend {
    override fun execute() {
        mDownReceiver.action()
    }

    override fun unExecute() {

    }
}