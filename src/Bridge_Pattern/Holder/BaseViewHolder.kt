package Bridge_Pattern.Holder

import Bridge_Pattern.Resource.IResource

abstract class BaseViewHolder<R:IResource>(protected val resource: R) {
    abstract fun itemViewOnClick()

    open fun showViewVisibility() {
        println("tvTitle:${resource.tvTitleVisibility()} ivCover:${resource.ivCoverVisibility()} ivFav:${resource.ivFavVisibility()}")
    }
}