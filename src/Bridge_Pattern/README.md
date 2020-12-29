# Bridge Pattern 橋接模式 #
個人理解 
----------------
    簡單來說就是一個物件依賴另外一個物件，兩兩組成一個組合，透過依賴和介面來解除耦合，例如:(A,B)(1,2)兩兩要組合再一起，
    那就會有(A1)(A2)(B1)(B2)四種class，萬一未來又新增了一種類型，假如變成(A,B,C)(1,2,3)那們一共就會變3*3=9種class，
    每當新增一種就要重複再寫一次一模一樣的程式碼。
    
    使用Bridge Pattern可以從M*N種減少為M+N種，剛好之前有遇到一種需求，RecyclerView的ViewHolder會有多種UI的變化，
    而原先ViewHolder在跳轉的時候會依照不同的型別傳入不同的資料，例如:原先的ViewHolder透過繼承來處理goActivity來決定
    每個類型要傳遞的資料，可是現在變成ViewHolder會有不同的UI，所以之前是1*N種ViewHolder現在變成M*N種ViewHolder，
    這樣寫下去肯定不合理，萬一又多了一種UI這樣我不就要在new N個class出來。
    
    使用Bridge Pattern傳入Resource讓ViewHolder透過resource來決定要顯示的東西，和跳轉的時候該傳遞什麼，範例的缺點就是
    ViewHolder實際上要處理UI的顯示，而範例沒辦法只針對某種ViewHolder決定要不要顯示，要馬就是都顯示不然就是都隱藏，
    比如:VipResource就不希望出現收藏按鈕(ivFav)，如果我把ivFavVisibility(): Boolean = false設成了false這樣所有的
    ViewHolder都不會顯示ivFav，萬一PM發病說我希望LongViewHolder和ShortViewHolder顯示GridViewHolder不顯示那就頭痛了。
   
    目前想不到好方法可以把UI剝離的乾淨一點，只能用interface去區分。
參考連結
---------------
<a href="https://www.youtube.com/watch?v=F1YQ7YRjttI&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=11">https://www.youtube.com/watch?v=F1YQ7YRjttI&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=11

![UML](../scr/Bridge_Pattern/uml.png)