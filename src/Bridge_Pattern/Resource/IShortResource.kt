package Bridge_Pattern.Resource

import Bridge_Pattern.Resource.IResource

interface IShortResource: IResource {
    fun tagVisibility(): Boolean
}