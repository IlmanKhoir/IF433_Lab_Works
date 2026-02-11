package oop_00000107437_MuhammadFadhilIlmanKhoir.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.1415926535

    //calculation
    var area = pi * radius * radius

    //output Concatenation
    println("Radius: $radius, Area: $area")

    //logic check
    checkSize(area)
}
fun checkSize(area: Double) {
    if (area > 100){
        println("this is a big circle")
    } else {
        println("this is a small circle")
    }
}