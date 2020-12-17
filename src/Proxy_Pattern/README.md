# Proxy Pattern 代理人模式 #
個人理解 
----------------
    Proxy簡單來說就是透過代理人去操作實際的物件，但是你可以在Proxy做出各種的操作和判斷，比如說開車好了，你可以在
    openCar()這個方法之前去判斷使用者是否已超過18歲，這樣子就不再Car這個物件裡面做判斷了，在複雜一點有些國家可能
    18歲可以開車了，有些可能要20歲這時候只需要在Proxy判斷是哪個國家就可以去判斷了，而不需要在Car這個物件去判斷
    這樣也符合單一職責原理。
    
    Proxy跟Adapter模式非常的像，但是最大的區別就在Proxy和RealSubject都會繼承同一個ISubject介面，而Adapter
    則是把物件給轉型了。
    
    Retrofit好像也是使用Proxy模式。
參考連結
---------------
<a href="https://www.youtube.com/watch?v=NwaabHqPHeM&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=10&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=NwaabHqPHeM&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=10&ab_channel=ChristopherOkhravi

<a href="http://corrupt003-design-pattern.blogspot.com/2016/10/proxy-pattern.html">http://corrupt003-design-pattern.blogspot.com/2016/10/proxy-pattern.html
