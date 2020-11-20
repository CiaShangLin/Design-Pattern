package Strategy_Pattern.Demo.Player

import Strategy_Pattern.Demo.Behavior.CheckBeforePlay
import Strategy_Pattern.Demo.Api.LongVideoApi
import Strategy_Pattern.Demo.Behavior.WatchCount

class LongPlayer : BasePlayer {
    override val playType: Int= PlayType.LongPlayer
    override val clickText: String = "LongPlayer"

    constructor() : super() {
        mIGetApi = LongVideoApi()
        mICheckBeforePlay = CheckBeforePlay()
        mIWatchCount = WatchCount()
    }
}