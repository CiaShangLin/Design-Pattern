package Observable_Pattern

//可以在建構值上輸入Name來區分
class PhoneDisplay:IObserver<String> {
    //可以自定義預設資料
    override fun update(it: String) {
        //可以將資料暫存起來
        print("PhoneDisplay update:$it\n")
    }
}