package Strategy_Pattern.Demo.Player

import Strategy_Pattern.Demo.Behavior.CheckBeforePlay
import Strategy_Pattern.Demo.Api.SpecialVideoApi

class SpecialPlayer : BasePlayer {
    override val playType: Int= PlayType.SpecialPlayer
    override val clickText: String = "SpecialPlayer"

    constructor() : super() {
        mIGetApi = SpecialVideoApi()
        mICheckBeforePlay = CheckBeforePlay()
        mIWatchCount = null
    }
}