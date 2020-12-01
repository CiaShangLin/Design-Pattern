package Singleton_Pattern

//object kt的專用的方法,可以確保一定是Singleton
object SingletonKt {
    private val instance = Singleton()

    fun getInstance(): Singleton = instance
}

class Singleton {
    fun a(){}
    fun b(){}
}