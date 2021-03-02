package State_Pattern

fun main(){

    val gate = Gate()

    gate.enter()
    gate.pay("000000")
    gate.pay("906906")


    gate.enter()
    gate.pay("")
}