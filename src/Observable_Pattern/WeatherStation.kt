package Observable_Pattern

class WeatherStation : IObservable<String> {
    private val mObserverList = mutableListOf<IObserver<String>>()
    private var mWeatherState: String = "預設天氣27度C"

    override fun add(observer: IObserver<String>) {
        mObserverList.add(observer)
    }

    override fun remove(observer: IObserver<String>) {
        mObserverList.remove(observer)
    }

    override fun notifyObserver() {
        mObserverList.forEach {
            it.update(mWeatherState)
        }
    }

    //測試修改後notify用
    fun setWeatherState(weatherState: String) {
        mWeatherState = weatherState
    }

    fun getWeatherState() = mWeatherState

}