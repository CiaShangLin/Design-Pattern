package Strategy_Pattern.Quack

import Strategy_Pattern.Behavior.IQuackBehavior

class WildDuckQuack: IQuackBehavior {
    override fun quack() {
        print("野鴨：野野野\n")
    }
}