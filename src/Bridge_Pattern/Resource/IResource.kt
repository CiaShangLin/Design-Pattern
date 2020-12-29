package Bridge_Pattern.Resource

interface IResource {
    //跳轉
    fun goActivity(holder: String)

    //標題
    fun tvTitleVisibility(): Boolean

    //封面
    fun ivCoverVisibility(): Boolean

    //收藏
    fun ivFavVisibility(): Boolean
}