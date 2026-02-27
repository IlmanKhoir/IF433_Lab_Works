package oop_00000107437_MuhammadFadhilIlmanKhoir.week4

open class Car(brand: String, val numberOfDoor: Int): Vehicle(brand) {
    fun openTrunck(){
        println("Bagasi mobil $brand dengna $numberOfDoor pintu dibuka.")
    }
}