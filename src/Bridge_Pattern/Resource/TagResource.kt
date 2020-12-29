package Bridge_Pattern.Resource

import Bridge_Pattern.Resource.BaseResource

class TagResource : BaseResource() {

    override fun actorVisibility(): Boolean = false

    override fun goActivity(holder: String) {
        println("$holder TagResource")
    }
}