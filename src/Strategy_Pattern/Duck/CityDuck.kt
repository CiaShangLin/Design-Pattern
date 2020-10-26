package Strategy_Pattern.Duck

import Strategy_Pattern.Fly.CityDuckFly
import Strategy_Pattern.Quack.CityDuckQuack
import Strategy_Pattern.Behavior.IFlyBehavior
import Strategy_Pattern.Behavior.IQuackBehavior

class CityDuck : Duck(CityDuckFly(), CityDuckQuack()) {
}