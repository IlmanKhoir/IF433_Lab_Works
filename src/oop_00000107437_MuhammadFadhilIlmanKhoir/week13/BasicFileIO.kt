package oop_00000107437_MuhammadFadhilIlmanKhoir.week13

fun main() {
    // --- CHECKPOINT 1 ---
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")

    // --- CHECKPOINT 2 ---
    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")
}