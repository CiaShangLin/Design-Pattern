package Proxy_Pattern

class DBManager :ISubject{
    private val mData= listOf<String>("1","2","3")
    override fun getData(): List<String> {
        return mData
    }
}