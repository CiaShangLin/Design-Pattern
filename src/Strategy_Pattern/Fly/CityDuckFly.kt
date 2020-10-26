package Strategy_Pattern.Fly

import Strategy_Pattern.Behavior.IFlyBehavior

class CityDuckFly : IFlyBehavior {
    override fun fly() {
        print("城市鴨飛一下 Fly\n")
    }
}