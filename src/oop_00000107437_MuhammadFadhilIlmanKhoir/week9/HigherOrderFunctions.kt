package oop_00000107437_MuhammadFadhilIlmanKhoir.week9

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original numbers: $numbers")
    println("\n === HOF: FILTER ===")
    //filter() membuat list baru berisi elemen yang memenuhi kondisi (true)
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    println("\n === HDF : MAP ===")
    //map() merubah bentuk nilai data. tapi ukurannya tetap sama
    val multipad = evens.map {it + 10}
    val asString = multipad.map {"RP. ${it}k"}
    println("Multipad: $multipad")
    println("Formatted: $asString")

    //sortedBY dan forEach
    println("\n === HDF : Sorted dan ForEach ===")
    val randomNames = listOf("Charlie", "Alice", "Bob")

    //sortedbyAscendding mengurutkan dari belakang
    val sortedReverse = randomNames.sortedByDescending{it}

    //forEach mengeksekusi aksi untuk tiap elemen (tidak mereturn list)
    sortedReverse.forEach { name ->
        println("user: $name")
    }
}