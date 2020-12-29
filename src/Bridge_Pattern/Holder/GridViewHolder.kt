package Bridge_Pattern.Holder

import Bridge_Pattern.Resource.IGridResource

class GridViewHolder<R : IGridResource>(iGridResource: R) : BaseViewHolder<R>(iGridResource) {
    override fun itemViewOnClick() {
        resource.goActivity("GridViewHolder")
    }
}