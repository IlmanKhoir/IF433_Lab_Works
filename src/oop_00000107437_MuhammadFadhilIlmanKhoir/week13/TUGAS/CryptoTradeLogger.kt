package oop_00000107437_MuhammadFadhilIlmanKhoir.week13.TUGAS

import java.io.File
import java.io.FileNotFoundException

// --- CHECKPOINT 11 ---
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)
// --- CHECKPOINT 12 ---
// Serialization
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

// --- CHECKPOINT 13 & 14 ---
// Deserialization dengan pengaman error handling
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        // Menangkap NumberFormatException, IndexOutOfBoundsException, dll.
        println("(Log) Data korup diabaikan: $line")
        null
    }
}
// --- CHECKPOINT 15 ---
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}
// --- CHECKPOINT 16 ---
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File histori transaksi tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    // --- CHECKPOINT 17 ---
    val mockTrades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 150.0, pnl = 45.5),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 100.0, pnl = -12.3),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 50.0, pnl = 15.2)
    )
    saveTrades(mockTrades, "crypto_trades.csv")
}