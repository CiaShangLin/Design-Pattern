# Decorator Pattern 觀察者模式 #
## 個人理解 ##
    裝飾子模式我認為比較不好理解的原因是AddDecorator也去繼承Beverage，同時持有了一個Beverage，
    而且實際在使用的時候他new出來的物件是“裝飾子持有飲料”，而一般我們會覺得是“飲料添加了裝飾子”，
    以這個飲料的例子來說，應該把Beverage是為飲料店，這樣飲品跟添加物務都去繼承Beverage就不會感覺這麼奇怪了。
   
    裝飾子模式執行起來像是撥洋蔥一樣，一層一層的執行。特別適合執行需要疊加的任務，比如說："篩選"，假如有一個畫面
    他有很多開關按鈕可以選擇，每開一種他就會執行，每一種執行的策略也不相同但是回傳的東西是相同的。
    比如說有一個List依照上面的需求每開一個就會做一種Fliter，而這個Fliter也可以透過策略模式去擴展，
    如果不用裝飾子模式這樣一層一層的去包,而是用switch的話就需要對每一種Fliter標注名稱去篩選。
 
 參考連結
 ---------------
 <a href="https://www.youtube.com/watch?v=GCraGHx6gso&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=GCraGHx6gso&ab_channel=ChristopherOkhravi