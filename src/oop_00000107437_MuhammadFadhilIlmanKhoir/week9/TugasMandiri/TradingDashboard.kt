package oop_00000107437_MuhammadFadhilIlmanKhoir.week9.TugasMandiri



fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "CLOSED"),   // Profit & Closed
        TradeLog("BTCUSDT", "SHORT", 20, -5.2, "OPEN"),    // Loss & Open
        TradeLog("ETHUSDT", "LONG", 15, -12.0, "CLOSED"),  // Loss & Closed
        TradeLog("ETHUSDT", "LONG", 10, 25.0, "OPEN"),     // Profit & Open
        TradeLog("BTCUSDT", "SHORT", 50, 8.4, "CLOSED"),   // Profit & Closed
        TradeLog("ETHUSDT", "SHORT", 5, -2.5, "CLOSED")    // Loss & Closed
    )

    println(" === Riwayat Trading ===")
    tradeHistory.forEach { log ->
        println("Pair : ${log.pair} | ROE : ${log.roe}% | Status : ${log.status}")
    }

    val  closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
        .sortedBy { it.pair }
        .map { it.pair.uppercase() }

    closedTrades.forEach { println(it) }

    val winningTrades = tradeHistory
        .filter { it.roe > 0 }
        .sortedBy { it.pair }

    winningTrades.forEach { println(it) }

    val closeTrades = tradeHistory
        .filter{ it.roe < 0 }
        .sortedBy { it.pair }
    closeTrades.forEach { println(it) }

    val topPerformersString = tradeHistory
        .filter{it.roe > 0 && it.status == "CLOSED"}
        .sortedByDescending { it.roe }

//    topPerformersString.forEach { println(it) }

    val worstPerformersString = tradeHistory
        .filter{it.roe < 0 && it.status == "CLOSED"}
        .sortedBy { it.roe }
//    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    uniquePairs.forEach { println(it) }

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("\n === untuk yang profit ===")
    if (topPerformersString.isEmpty()) {
        println("Tidak ada performa profit saat ini.")
    } else {
        topPerformersString.forEach { line ->
            println(line)
        }
    }

    println("=== untuk yang lost ===")
    if (worstPerformersString.isEmpty()) {
        println("Tidak ada performa profit saat ini.")
    }else {
        worstPerformersString.forEach { line ->
            println(line)
        }
    }
}
