package Strategy_Pattern.Demo.Player

import Strategy_Pattern.Demo.Behavior.ICheckBeforePlay
import Strategy_Pattern.Demo.Behavior.IGetApi
import Strategy_Pattern.Demo.Behavior.IWatchCount

abstract class BasePlayer {
    abstract val playType: Int
    abstract val clickText: String
    protected var mIGetApi: IGetApi? = null
    protected var mICheckBeforePlay: ICheckBeforePlay? = null
    protected var mIWatchCount: IWatchCount? = null

    open fun getApi(videoId: String, cdn: String): String? {
        return mIGetApi?.getApi(videoId, cdn)
    }

    open fun checkBeforePlay(): Int? {
        return mICheckBeforePlay?.checkBeforePlay()
    }

    open fun watchCount(videoId: String) {
        mIWatchCount?.watchCount(videoId)
    }
}