package Decorator_Pattern.Beverage

import Decorator_Pattern.Beverage.Beverage

class Coffee: Beverage() {
    override fun cost(): Int = BeveragePriceList.Coffee
}