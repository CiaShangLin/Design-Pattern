package Decorator_Pattern.Decorator

import Decorator_Pattern.Beverage.Beverage

class Ice(beverage: Beverage) : AddDecorator(beverage) {
    override fun cost(): Int = mBeverage.cost() + DecoratorPriceList.Ice
}