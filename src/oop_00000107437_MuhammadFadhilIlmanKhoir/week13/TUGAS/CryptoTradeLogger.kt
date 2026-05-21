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