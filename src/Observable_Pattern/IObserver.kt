package Observable_Pattern

interface IObserver<T> {
    fun update(it:T)
}