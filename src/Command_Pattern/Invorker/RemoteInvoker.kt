package Command_Pattern.Invorker

import Command_Pattern.Commend.OffLightCommend
import Command_Pattern.Commend.OnLightCommend

class RemoteInvoker(protected val onLightCommend: OnLightCommend, protected val offLightCommend: OffLightCommend) {

    fun clickOn(){
        onLightCommend.execute()
    }

    fun clickOff(){
        offLightCommend.execute()
    }
}