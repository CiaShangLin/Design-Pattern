# Singleton Pattern 單例模式 #
個人理解 
----------------
    單例模式顧名思義就是怎麼new都會是同一個，目前常用於在LadingActivity的時候會拿到一些SystemConfig或是ApiConfig
    之類的，這些資料可能會在之後的任何地方都有機會使用到，如果不使用單例模式大概就只有直接宣告靜態變數和寫入資料庫才能取代
    單例模式。
    
    直接宣告靜態變數的缺點是，如果他被清除你沒辦法輕易復原，而且通常ApiConfig這東西通常會是很大一串的JSON，序列化之後
    如果要呼叫可能就會變成ApiConfig.data.a.b.c，你要拿到c就需要一路...下去。
    
    如果寫入資料庫最大的缺點就是你每次都要從資料庫再拿一下，而且還要再經過序列化，這樣相對消耗效能也浪費時間。
    
    通常我在使用單例模式會合併上面兩種寫法，在單例模式的class寫一個setApiConfig()的方法記錄住ApiConfig，同時寫入資料庫，
    在每次拿取的時候都會判斷靜態變數是不是等於null，如果是的話再從資料庫讀取出來還原，這樣的好處是既不用重打Api也不
    用每次都從資料庫重新拿取節省效能和時間，另一個就是ApiConfig.data.a.b.c這個就可以額外寫一個方法來代替掉，例如:
    getApiConfigC()這樣就清楚多了。
    
    單例模式最大的缺點應該就是不好測試很難去mock他，還有就是當App閃退的時候通常都會被清除掉。
參考連結
---------------
<a href="https://www.youtube.com/watch?v=hUE_j6q0LTQ&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=6&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=hUE_j6q0LTQ&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=6&ab_channel=ChristopherOkhravi