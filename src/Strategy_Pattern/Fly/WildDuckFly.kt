package Strategy_Pattern.Fly

import Strategy_Pattern.Behavior.IFlyBehavior

class WildDuckFly: IFlyBehavior {
    override fun fly() {
        print("野鴨飛三下 Fly Fly Fly\n")
    }
}