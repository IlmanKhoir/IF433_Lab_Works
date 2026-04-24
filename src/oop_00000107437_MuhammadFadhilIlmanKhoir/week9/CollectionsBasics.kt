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

    //LANGKAH KE-2
    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,3,4,5)
    println("Unique numbers: $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") //Diabaikan karena sudah ada
    println("activeUsers: $activeUsers")

    //LANGKAH KE-3
    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A", // Value boleh duplikat. key tidak
    )
    println("Nilai BOB: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apple" to 50, "Banana" to 30)
    inventory["Oranges"] = 20 //menambahkan data baru
    inventory["Apple"] = 45 // mengupdate data lama
    println("inventory: $inventory")
}