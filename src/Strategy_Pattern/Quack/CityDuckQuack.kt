package Strategy_Pattern.Quack

import Strategy_Pattern.Behavior.IQuackBehavior

class CityDuckQuack: IQuackBehavior {
    override fun quack() {
        print("城市鴨：瓜瓜瓜\n")
    }
}