package Facade_Pattern

class Phone : IPhone {
    var mScreen = ""

    override fun input(num: String) {
        mScreen = mScreen.plus(num)
    }

    override fun enter() {
        println(mScreen)
    }

    override fun delete() {
        mScreen = mScreen.slice(IntRange(0, mScreen.length - 2))
    }
}