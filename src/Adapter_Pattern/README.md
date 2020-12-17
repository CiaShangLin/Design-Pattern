# Adapter Pattern 轉接器模式 #
個人理解 
----------------
    轉接器模式顧名思義就把某個東西轉變成某個東西，例如:把3ping的插頭轉成2ping的插頭，這在現實生活上很常見。
    
    通常使用場景感覺都會在終端的東西不會變化在使用的，比如說:NFC感應，只要NFC這裡對應出去的接口定義好，你要使用
    什麼裝置來感應都不是問題，例如:手機,悠遊卡,鑰匙圈...。
    
    以Android最常見的就是RecyclverView的Adpater了，當我們繼承了RecyclerView.Adapter的時候，我們複寫的方法
    就是對應好的接口，而RecyclerView就是透過這些接口拿取他要的資料。
    
    假如不使用Adapter也是能辦到像是範例插頭轉接器的方法，寫一個3ping和2ping插頭的介面，然後讓每個插頭的class都實作
    3ping和2ping的介面，這個時候class應該會有get110V()和get220V()的方法，接著我們在直接轉型成我的要的型別就可以
    傳入Socket(插座)裡面去呼叫了。
    這樣的問題在哪？假設有N種插頭M種插座，每當你新增了一種插頭或是插座，所有的插頭就要再多實作一個介面，自身也要實作所有插頭的
    介面，這樣相同的程式碼一堆也不符合單一職責。

    應該是電器依賴插頭,插頭依賴插座才對
參考連結
---------------
<a href="https://www.youtube.com/watch?v=2PKQtcJjYvc&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=8">https://www.youtube.com/watch?v=2PKQtcJjYvc&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=8
