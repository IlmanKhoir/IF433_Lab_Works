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
}