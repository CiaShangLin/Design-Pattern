package Strategy_Pattern.Demo

import Strategy_Pattern.Demo.Player.HistoryPlayer
import Strategy_Pattern.Demo.Player.LongPlayer
import Strategy_Pattern.Demo.Player.SpecialPlayer
import Strategy_Pattern.Demo.Player.YoutubePlayer

fun main() {
    val longPlayer = LongPlayer()
    println(longPlayer.clickText)
    println(longPlayer.playType)
    println(longPlayer.getApi("videoId", "c"))
    println(longPlayer.checkBeforePlay())
    longPlayer.watchCount("videoId")

    println("----------------")

    val specialPlayer = SpecialPlayer()
    println(specialPlayer.clickText)
    println(specialPlayer.playType)
    println(specialPlayer.getApi("videoId", "c"))
    println(specialPlayer.checkBeforePlay())
    specialPlayer.watchCount("videoId")

    println("----------------")

    val youtubePlayer = YoutubePlayer()
    println(youtubePlayer.clickText)
    println(youtubePlayer.playType)
    println(youtubePlayer.getApi("videoId", "c"))
    println(youtubePlayer.checkBeforePlay())
    youtubePlayer.watchCount("videoId")

    println("----------------")

    val historyPlayer = HistoryPlayer("1")
    println(historyPlayer.clickText)
    println(historyPlayer.playType)
    println(historyPlayer.getApi("videoId", "c"))
    println(historyPlayer.checkBeforePlay())
    historyPlayer.watchCount("videoId")

    println("----------------")

    val historyPlayer2 = HistoryPlayer("2")
    println(historyPlayer2.clickText)
    println(historyPlayer2.playType)
    println(historyPlayer2.getApi("videoId", "c"))
    println(historyPlayer2.checkBeforePlay())
    historyPlayer2.watchCount("videoId")

    println("----------------")

    val historyPlayer3 = HistoryPlayer("3")
    println(historyPlayer3.clickText)
    println(historyPlayer3.playType)
    println(historyPlayer3.getApi("videoId", "c"))
    println(historyPlayer3.checkBeforePlay())
    historyPlayer3.watchCount("videoId")
}