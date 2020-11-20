package Strategy_Pattern.Demo.Api

import Strategy_Pattern.Demo.Behavior.IGetApi

class LongVideoApi: IGetApi {
    override fun getApi(videoId: String, cdn: String): String {
        return "Long Video Api"
    }
}