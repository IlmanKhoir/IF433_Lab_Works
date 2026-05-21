package oop_00000107437_MuhammadFadhilIlmanKhoir.week13

import java.io.File

fun main() {
    // --- CHECKPOINT 4 ---
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()
    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA: Jika terjadi Exception di sini, writer.close() di bawah tidak akan tereksekusi!
    writer.close()
    println("Proses penulisan unsafe selesai.")

    // --- CHECKPOINT 5 ---
    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")
    // Writer akan OTOMATIS di-close saat keluar dari blok kurawal use
    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
}