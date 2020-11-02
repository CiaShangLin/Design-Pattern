# Abstract Factory Pattern 工廠模式 #
## 個人理解 ##
    單看工廠模式會有點空虛要搭配抽象工廠兩集一起看，工廠類別比較像是內聚力更強的class，
    如果不用工廠模式就會變成一個class注入非常多的class，例如:Mac(Button(),CheckBox(),...)
    用了工廠類別之後就可以直接去new Factory()解決。
    
    舉個例子:如果有一個RecyclerView的Adapter，他有ABCDE...種ViewHolder，某些ViewHolder會有某些原因
    選擇不顯示或是功能不能，比如從A Class跳轉到C class或是B Class跳轉到C Class，來判斷他來自哪裡，
    假如從A來的顯示ABCDE，從B來的只顯示ABC，那們有兩個方法可以來處理這個問題。
    
    第一種寫一個抽象的BaseUIClass來讓A和B繼承，BaseUIClass對於每個UI原件都設置一個Boolean來決定要不要讓他顯示，
    然後A B在自己決定開關，最後在Activity去判斷 if(A.XXXUI()==true) View.VISIBLE else View.GONE。
    
    第二種就是用工廠類別搭配MergeAdapter，把每一個ViewHolder都拆到各個Adapter，最後透過MergeAdapter合併起來，
    實作的方法就會變成MergeAdapter(A_Factory.getA_Adapter(),A_Factory.getB_Adapter()...)，如果要不顯示就
    回傳null判斷要不要新增或者是回傳一個itemCount==0的Adapter也可以。
    
參考連結
---------------
<a href="https://www.youtube.com/watch?v=EcFVTgRHJLM&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=EcFVTgRHJLM&ab_channel=ChristopherOkhravi
<a href="https://www.youtube.com/watch?v=v-GiuMmsXj4&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=v-GiuMmsXj4&ab_channel=ChristopherOkhravi