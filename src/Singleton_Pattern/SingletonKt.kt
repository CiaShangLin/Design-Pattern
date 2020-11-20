package Singleton_Pattern

//object kt的專用的方法,可以確保一定是Singleton
object SingletonKt {
    fun getInstance(): SingletonKt = this
}