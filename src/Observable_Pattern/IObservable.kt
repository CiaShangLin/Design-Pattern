package Observable_Pattern

interface IObservable<T> {
    fun add(observer:IObserver<T>)
    fun remove(observer:IObserver<T>)
    fun notifyObserver()  //這裡如果命名為notify好像會跟原本Observable衝突
}