package Bridge_Pattern.Holder

import Bridge_Pattern.Resource.IShortResource

class ShortViewHolder<R : IShortResource>(iShortResource: R) : BaseViewHolder<R>(iShortResource) {
    override fun itemViewOnClick() {
        resource.goActivity("ShortViewHolder")
    }

    override fun showViewVisibility() {
        super.showViewVisibility()
        println("tvTag:${resource.tagVisibility()}")
    }
}