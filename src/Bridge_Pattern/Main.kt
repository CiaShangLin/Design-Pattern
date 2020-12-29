package Bridge_Pattern

import Bridge_Pattern.Holder.GridViewHolder
import Bridge_Pattern.Holder.LongViewHolder
import Bridge_Pattern.Holder.ShortViewHolder
import Bridge_Pattern.Resource.SearchResource
import Bridge_Pattern.Resource.TagResource
import Bridge_Pattern.Resource.VipResource

fun main() {

    val searchResource = SearchResource()
    val longViewHolder = LongViewHolder(searchResource)
    val gridViewHolder = GridViewHolder(searchResource)
    val shortViewHolder = ShortViewHolder(searchResource)

    println("SearchResource")
    longViewHolder.showViewVisibility()
    longViewHolder.itemViewOnClick()
    println("----------------------")
    gridViewHolder.showViewVisibility()
    gridViewHolder.itemViewOnClick()
    println("----------------------")
    shortViewHolder.showViewVisibility()
    shortViewHolder.itemViewOnClick()
    println("----------------------")

    val tagResource = TagResource()
    val longViewHolder2 = LongViewHolder(tagResource)
    val gridViewHolder2 = GridViewHolder(tagResource)
    val shortViewHolder2 = ShortViewHolder(tagResource)

    println("TagResource")
    longViewHolder2.showViewVisibility()
    longViewHolder2.itemViewOnClick()
    println("----------------------")
    gridViewHolder2.showViewVisibility()
    gridViewHolder2.itemViewOnClick()
    println("----------------------")
    shortViewHolder2.showViewVisibility()
    shortViewHolder2.itemViewOnClick()
    println("----------------------")

    val vipResource = VipResource()
    val longViewHolder3 = LongViewHolder(vipResource)
    val gridViewHolder3 = GridViewHolder(vipResource)
    val shortViewHolder3 = ShortViewHolder(vipResource)

    println("VipResource")
    longViewHolder3.showViewVisibility()
    longViewHolder3.itemViewOnClick()
    println("----------------------")
    gridViewHolder3.showViewVisibility()
    gridViewHolder3.itemViewOnClick()
    println("----------------------")
    shortViewHolder3.showViewVisibility()
    shortViewHolder3.itemViewOnClick()
    println("----------------------")

}