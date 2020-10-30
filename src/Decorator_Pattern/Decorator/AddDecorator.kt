package Decorator_Pattern.Decorator

import Decorator_Pattern.Beverage.Beverage

abstract class AddDecorator(protected val mBeverage: Beverage): Beverage() {
}