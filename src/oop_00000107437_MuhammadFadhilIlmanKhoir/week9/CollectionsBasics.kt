package oop_00000107437_MuhammadFadhilIlmanKhoir.week9

fun main() {
    println("=== Test List===")
    //immutable List: Tidak bisa diubah setelah dibuat
    val framework: List<String> = listOf("Kotlin", "Java", "C++", "C++")
    //framework.add("Python") // UNCOMENT INI AKAN EROR!
    println("IMMUTABLE LIST: $framework")

    //Mutable list: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 80
    println("MUTABLE LIST: $scores")
}