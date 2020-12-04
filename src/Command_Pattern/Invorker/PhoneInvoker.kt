package Command_Pattern.Invorker

import Command_Pattern.Commend.DownLightCommend
import Command_Pattern.Commend.OffLightCommend
import Command_Pattern.Commend.OnLightCommend
import Command_Pattern.Commend.UpLightCommend

class PhoneInvoker(
    protected val onLightCommend: OnLightCommend,
    protected val offLightCommend: OffLightCommend,
    protected val upLightCommend: UpLightCommend,
    protected val downLightCommend: DownLightCommend
) {

    fun onClick() {
        onLightCommend.execute()
    }

    fun offClick() {
        offLightCommend.execute()
    }

    fun upClick() {
        upLightCommend.execute()
    }

    fun downClick() {
        downLightCommend.execute()
    }
}