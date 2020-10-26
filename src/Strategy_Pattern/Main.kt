package Strategy_Pattern

import Strategy_Pattern.Duck.CityDuck
import Strategy_Pattern.Duck.Duck
import Strategy_Pattern.Duck.MixDuck
import Strategy_Pattern.Duck.WildDuck

fun main() {
    val cityDuck = CityDuck()
    val wildDuck = WildDuck()
    val mixDuck = MixDuck()
    cityDuck.quack()
    cityDuck.fly()

    wildDuck.quack()
    wildDuck.fly()

    mixDuck.quack()
    mixDuck.fly()

//    val duckList = mutableListOf<Duck>()
//    for (i in 0..20) {
//        if (Math.random() >= 0.5) {
//            duckList.add(WildDuck())
//        } else {
//            duckList.add(CityDuck())
//        }
//    }
//    duckList.forEach {
//        it.quack()
//        it.fly()
//    }
}