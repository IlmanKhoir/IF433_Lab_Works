package oop_00000107437_MuhammadFadhilIlmanKhoir.week4

open class Car(brand: String, val numberOfDoor: Int): Vehicle(brand) {
    fun openTrunck(){
        println("Bagasi mobil $brand dengna $numberOfDoor pintu dibuka.")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}