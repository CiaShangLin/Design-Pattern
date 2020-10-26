package Strategy_Pattern.Duck

import Strategy_Pattern.Fly.WildDuckFly
import Strategy_Pattern.Quack.CityDuckQuack

//混種鴨
class MixDuck:Duck(WildDuckFly(),CityDuckQuack()) {
}