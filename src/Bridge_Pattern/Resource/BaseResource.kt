package Bridge_Pattern.Resource

abstract class BaseResource : IResource,
    ILongResource, IShortResource,
    IGridResource {


    //-----IResource-----
    override fun tvTitleVisibility(): Boolean = true

    override fun ivCoverVisibility(): Boolean = true

    override fun ivFavVisibility(): Boolean = true

    //-----ILongResource-----
    override fun actorVisibility(): Boolean = true

    //-----IShortResource-----
    override fun tagVisibility(): Boolean = true
}