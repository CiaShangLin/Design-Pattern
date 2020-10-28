# Observer Pattern 觀察者模式 #
## 個人理解 ##
    觀察者模式簡單來說就是多對一的觀察，像這次的範例:氣象站更新了氣象，此時就會通知觀察者，
    氣象站更新了資料請你們也更新畫面。氣象站是被觀察者而DisPlay是觀察者。
    
    還有一個日常也很符合觀察者模式的東西，那就是股票，當交易所產了一筆交易導致某隻股票價格變動，
    此時就該通知有觀察這隻股票的DisPlay。
    
    觀察者模式在很多語言都有預設的class了，通常不需要自己再去撰寫，像是在Android比較常遇到的
    就是MVVM和LiveData，還有RxJava基本上都觀察者模式上的延伸。
    
參考連結
---------------
<a href="https://www.youtube.com/watch?v=_BpmfnqjgzQ&ab_channel=ChristopherOkhraviChristopherOkhravi">https://www.youtube.com/watch?v=_BpmfnqjgzQ&ab_channel=ChristopherOkhraviChristopherOkhravi