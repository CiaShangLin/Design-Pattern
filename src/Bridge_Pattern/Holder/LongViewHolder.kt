package Bridge_Pattern.Holder

import Bridge_Pattern.Resource.ILongResource

class LongViewHolder<R : ILongResource>(iLongResource: R) : BaseViewHolder<R>(iLongResource) {
    override fun itemViewOnClick() {
        resource.goActivity("LongViewHolder")
    }

    override fun showViewVisibility() {
        super.showViewVisibility()
        println("ivActor:${resource.actorVisibility()}")
    }
}