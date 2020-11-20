package Singleton_Pattern

fun main() {

    var isSameKt = 0
    for (i in 0..10000) {
        Thread(Runnable {
            var singletonKt = SingletonKt.getInstance()
            if (isSameKt != 0 && isSameKt != singletonKt.hashCode()) {
                println("多線程導致new出了其他的實例")
            } else {
                isSameKt = singletonKt.hashCode()
            }
        }).start()
    }

    var isSameJava = 0
    for (i in 0..10000) {
        Thread(Runnable {
            var singletonJava = SingletonJava.getInstance()
            if (isSameJava != 0 && isSameJava != singletonJava.hashCode()) {
                println("多線程導致new出了其他的實例")
            } else {
                isSameJava = singletonJava.hashCode()
            }
        }).start()
    }

}