package Decorator_Pattern.Beverage

import Decorator_Pattern.Beverage.Beverage

class Tea: Beverage() {
    override fun cost(): Int = BeveragePriceList.Tea
}