package Strategy_Pattern.Demo.Behavior

//目前只有一種判斷
class CheckBeforePlay : ICheckBeforePlay {
    //這裡會有很多function做很多判斷,來決定要回傳什麼
    //例如:IsVip return 1 , isHistory return 2 ,isAwarded return 3 ...
    override fun checkBeforePlay(): Int {
        return 0
    }
}