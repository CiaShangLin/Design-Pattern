package Strategy_Pattern.Demo.Player

import Strategy_Pattern.Demo.Behavior.CheckBeforePlay
import Strategy_Pattern.Demo.Behavior.WatchCount
import Strategy_Pattern.Demo.Api.YoutubeVideoApi

class YoutubePlayer : BasePlayer {
    override val playType: Int= PlayType.YoutubePlayer
    override val clickText: String = "YoutubePlayer"

    constructor() : super() {
        mIGetApi = YoutubeVideoApi()
        mICheckBeforePlay = CheckBeforePlay()
        mIWatchCount = WatchCount()
    }


}