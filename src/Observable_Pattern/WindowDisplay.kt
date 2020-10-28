package Observable_Pattern

class WindowDisplay:IObserver<String> {
    override fun update(it: String) {
        print("WindowDisPlay update:$it\n")
    }
}