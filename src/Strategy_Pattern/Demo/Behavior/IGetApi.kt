package Strategy_Pattern.Demo.Behavior

interface IGetApi {
    //這裡實際上應該是Rx的Respones
    fun getApi(videoId: String, cdn: String): String
}