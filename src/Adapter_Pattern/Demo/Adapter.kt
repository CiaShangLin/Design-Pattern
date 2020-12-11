package Adapter_Pattern.Demo

class Adapter : ITarget {
    private val mAdaptee = Adaptee()

    override fun request() {
        mAdaptee.doSomeThing()
    }
}