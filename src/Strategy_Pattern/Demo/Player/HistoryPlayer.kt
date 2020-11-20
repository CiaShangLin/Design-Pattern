package Strategy_Pattern.Demo.Player

class HistoryPlayer : BasePlayer {
    override val playType: Int
    override val clickText: String

    private var mPlayer: BasePlayer? = null

    constructor(videoId: String) : super() {
        playType = when (videoId) {
            "1" -> PlayType.LongPlayer
            "2" -> PlayType.SpecialPlayer
            "3" -> PlayType.YoutubePlayer
            else -> -1
        }
        mPlayer = when (playType) {
            PlayType.LongPlayer -> {
                LongPlayer()
            }
            PlayType.SpecialPlayer -> {
                SpecialPlayer()
            }
            PlayType.YoutubePlayer -> {
                YoutubePlayer()
            }
            else -> {
                throw RuntimeException("No this playType motherFucker")
            }
        }
        clickText = mPlayer?.clickText ?: "motherFucker"
    }

    override fun getApi(videoId: String, cdn: String): String? {
        return mPlayer?.getApi(videoId,cdn)
    }

    override fun checkBeforePlay(): Int? {
        return mPlayer?.checkBeforePlay()
    }

    override fun watchCount(videoId: String) {
        mPlayer?.watchCount(videoId)
    }
}