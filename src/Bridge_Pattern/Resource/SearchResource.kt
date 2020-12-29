package Bridge_Pattern.Resource

import Bridge_Pattern.Resource.BaseResource

class SearchResource: BaseResource() {
    override fun goActivity(holder: String) {
        println("$holder SearchResource")
    }
}