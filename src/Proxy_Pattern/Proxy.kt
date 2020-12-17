package Proxy_Pattern

class Proxy : ISubject {
    private val mDBManager = DBManager()

    constructor(account: String, password: String) {
        if (account != "123" && password != "123") {
            throw Exception("帳密輸入錯誤")
        }
    }


    override fun getData(): List<String> {
        return mDBManager.getData()
    }
}