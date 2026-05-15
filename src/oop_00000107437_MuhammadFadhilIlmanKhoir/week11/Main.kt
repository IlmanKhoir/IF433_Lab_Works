package oop_00000107437_MuhammadFadhilIlmanKhoir.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}