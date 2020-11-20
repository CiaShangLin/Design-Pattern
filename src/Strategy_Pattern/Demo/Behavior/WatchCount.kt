package Strategy_Pattern.Demo.Behavior

class WatchCount : IWatchCount {
    private var mIsHistory: Boolean? = null
    private var mIsWatchCount = false
    override fun watchCount(videoId: String) {
        //如果做過了或是歷史紀錄就不做了
        if (mIsWatchCount || mIsHistory == true) {
            return
        }
        println("do something")
        mIsWatchCount = true
    }
}