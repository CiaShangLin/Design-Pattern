package Facade_Pattern

fun main() {

    val phone: IPhone = Phone()
    phone.input("1")
    phone.input("2")
    phone.input("3")
    phone.enter()

    phone.delete()
    phone.enter()
}