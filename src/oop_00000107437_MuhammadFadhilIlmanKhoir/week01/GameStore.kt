package oop_00000107437_MuhammadFadhilIlmanKhoir.week01

fun main() {
    val gameTitle: String = "Ragnarok X"
    val price: Int = 750000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)
fun printReceipt(title: String, finalPrice: Int) {
    println(" penjualan dalam game ")
    println("Game Title : $title")
    println("Final Price: Rp $finalPrice")
}
