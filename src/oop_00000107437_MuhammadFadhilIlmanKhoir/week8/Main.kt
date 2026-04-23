package oop_00000107437_MuhammadFadhilIlmanKhoir.week8

fun main() {
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    val mixedData: List<Any> = listOf(
        "Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0
    )
    for (item in mixedData) {
        val text = item as? String
        text?.let { println("Ditemukan teks: ${it.uppercase()}") }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")

    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE) tertangkap!")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]) { "Token tidak ditemukan!" }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    //tes java interop
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    // Penggunaan !! dibenarkan karena kita yakin implementasi Java-nya tidak mengembalikan null
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")
}