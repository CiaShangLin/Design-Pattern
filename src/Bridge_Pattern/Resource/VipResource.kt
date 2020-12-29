package Bridge_Pattern.Resource

import Bridge_Pattern.Resource.BaseResource

class VipResource : BaseResource() {
    override fun ivFavVisibility(): Boolean = false

    override fun goActivity(holder: String) {
        println("$holder VipResource")
    }
}