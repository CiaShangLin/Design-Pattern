package Strategy_Pattern.Demo.Api

import Strategy_Pattern.Demo.Behavior.IGetApi

class SpecialVideoApi: IGetApi {
    override fun getApi(videoId: String, cdn: String): String {
        return "Special Video Api"
    }
}