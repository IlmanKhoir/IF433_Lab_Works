package oop_00000107437_MuhammadFadhilIlmanKhoir.week10

class mathbox<T : Number>(val value1: T, val value2: T){
    fun sum(): Double{
        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> getmax(a : T, b : T) : T where T : Comparable<T> {
    return if (a > b) a else b
}