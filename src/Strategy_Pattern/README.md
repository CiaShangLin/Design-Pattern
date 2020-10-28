# Strategy Pattern 策略模式 #
個人理解 
----------------
    在沒有使用Strategy Pattern的情況下
    Duck的抽象方法會讓子類去繼承複寫，當子類多了起來就會發現有很多方法裡面實作的內容是重複的，
    這時候就會想把相似的子類在抽成父類再給新的類別繼承，可是整個結構就會像一串葡萄一樣，
    每當上面一動下面就會受影響。
    
    使用Strategy Pattern的情況下
    由Duck這個父類別來呼叫Behavior，將要使用的Behavior注入到建構值裡面，Behavior抽象成介面這樣方便繼承擴充，
    繼承Duck的子類只需要設定好要注入的Behavior class就好，這樣的優點在於每個Behavior都是水平化的，每個子類
    只需要挑選自己要用的behavior就好，成功地將整個繼承樹扁平化。
    
參考連結
---------------
<a href="https://www.youtube.com/watch?v=v9ejT8FO-7I">https://www.youtube.com/watch?v=v9ejT8FO-7I