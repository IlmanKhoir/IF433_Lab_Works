package oop_00000107437_MuhammadFadhilIlmanKhoir.week01

fun main() {
    val radius = 7.0
    val pi = 3.1415926535

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double) =
    if (area > 100) "this is a big circle"
    else "this is a small circle"
