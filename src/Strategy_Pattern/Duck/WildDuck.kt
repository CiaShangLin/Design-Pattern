package Strategy_Pattern.Duck

import Strategy_Pattern.Behavior.IFlyBehavior
import Strategy_Pattern.Behavior.IQuackBehavior
import Strategy_Pattern.Fly.WildDuckFly
import Strategy_Pattern.Quack.WildDuckQuack

class WildDuck : Duck(WildDuckFly(), WildDuckQuack()) {


}