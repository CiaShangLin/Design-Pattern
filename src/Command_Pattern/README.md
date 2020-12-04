# Commend Pattern 命令模式 #
個人理解 
----------------
    命令模式能夠拆分發出命令的和接收命令的解藕，特別適用於需要可以復原的功能，比如說像是ps這種軟體，每一個按鈕都是一個功能
    也是一個命令，ctrl+z就能返回剛剛做的命令。
    
    這個燈泡的範例主要是他有複數個invoker去命令操作同一個東西，我們將commend和receiver區分了出來,由invoker去呼叫操作，
    理論上invoker應該會儲存命令來用於執行或是復原，而receiver紀錄狀態。
    
    Commend Pattern雖然用途很廣但是目前專案裡面沒有什麼用到所以理解不深。
    
參考連結
---------------
<a href="https://www.youtube.com/watch?v=9qA5kw8dcSU&ab_channel=ChristopherOkhravi">https://www.youtube.com/watch?v=9qA5kw8dcSU&ab_channel=ChristopherOkhravi

<a href="https://notfalse.net/4/command-pattern">https://notfalse.net/4/command-pattern