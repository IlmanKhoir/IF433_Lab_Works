package oop_00000107437_MuhammadFadhilIlmanKhoir.week12

fun divide (a: Int, b: Int): Int {
    try {
        return a /b
    } catch (e: ArithmeticException) {
        println("EROR: " + e.message)
        return -1
    } finally {
        println("Division attempt finished.")
    }
}