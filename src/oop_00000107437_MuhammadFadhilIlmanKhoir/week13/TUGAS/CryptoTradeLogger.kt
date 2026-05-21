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