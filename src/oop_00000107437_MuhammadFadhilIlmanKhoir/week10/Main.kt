package oop_00000107437_MuhammadFadhilIlmanKhoir.week10

fun main() {
    println ("====Testing generic class====")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println("isi intBox : ${intBox.value}")
    println("isi stringBox : ${stringBox.value}")
}