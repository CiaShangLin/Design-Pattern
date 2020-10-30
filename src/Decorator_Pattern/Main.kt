package Decorator_Pattern

import Decorator_Pattern.Beverage.Coffee
import Decorator_Pattern.Decorator.Ice
import Decorator_Pattern.Decorator.Slot
import Decorator_Pattern.Decorator.Sugar
import Decorator_Pattern.Beverage.Tea

fun main() {

    var coffee = Coffee()
    print("coffee cost:${coffee.cost()}\n")

    var slot = Slot(coffee)
    print("coffee+slot cost:${slot.cost()}\n")

    var ice = Ice(slot)
    print("coffee+slot+ice cost:${ice.cost()}\n")

    var tea = Ice(Sugar(Tea()))
    print("Tea + Sugar + Ice cost:${tea.cost()}")
}