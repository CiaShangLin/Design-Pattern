package Observable_Pattern

fun main() {
    val weatherStation = WeatherStation()
    val phoneDisplay_1 = PhoneDisplay()
    val phoneDisplay_2 = PhoneDisplay()
    val windowDisplay_1 = WindowDisplay()
    val windowDisplay_2 = WindowDisplay()

    weatherStation.add(phoneDisplay_1)
    weatherStation.add(phoneDisplay_2)
    weatherStation.add(windowDisplay_1)
    weatherStation.add(windowDisplay_2)
    weatherStation.notifyObserver()

    weatherStation.setWeatherState("丞相起風了 溫度20度C")
    weatherStation.notifyObserver()

    weatherStation.remove(phoneDisplay_2)
    weatherStation.remove(windowDisplay_2)

    weatherStation.setWeatherState("冬天來了 目前氣溫8度C")
    weatherStation.notifyObserver()
}