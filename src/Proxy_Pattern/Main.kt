package Proxy_Pattern

fun main(){
    try{
        val proxy = Proxy("1","1")
        println(proxy.getData())
    }catch (e:Exception){
        println(e.message)
    }

    try{
        val proxy = Proxy("123","123")
        println(proxy.getData())
    }catch (e:Exception){
        println(e.message)
    }
}