package oop_00000107437_MuhammadFadhilIlmanKhoir.week8

fun main() {
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}