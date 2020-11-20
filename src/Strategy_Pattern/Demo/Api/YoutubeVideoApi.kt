package Strategy_Pattern.Demo.Api

import Strategy_Pattern.Demo.Behavior.IGetApi

class YoutubeVideoApi: IGetApi {
    override fun getApi(videoId: String, cdn: String): String {
        return "Youtube Video Api"
    }
}