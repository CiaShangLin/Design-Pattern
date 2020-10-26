package Strategy_Pattern.Duck

import Strategy_Pattern.Behavior.IDuck
import Strategy_Pattern.Behavior.IFlyBehavior
import Strategy_Pattern.Behavior.IQuackBehavior
import Strategy_Pattern.Quack.WildDuckQuack

abstract class Duck : IDuck {

    protected val mIFlyBehavior: IFlyBehavior
    protected val mIQuackBehavior: IQuackBehavior

    constructor(flyBehavior: IFlyBehavior, quackBehavior: IQuackBehavior) {
        this.mIFlyBehavior = flyBehavior
        this.mIQuackBehavior = quackBehavior
    }

    override fun fly() {
        mIFlyBehavior.fly()
    }

    override fun quack() {
        mIQuackBehavior.quack()
    }
}