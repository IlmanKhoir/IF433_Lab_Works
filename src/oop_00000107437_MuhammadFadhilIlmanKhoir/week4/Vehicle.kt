package oop_00000107437_MuhammadFadhilIlmanKhoir.week4

open class Vehicle(val brand: String){
    var speed: Int = 0

    // Method juga bersifat final secara default. gunakan 'open' agar bisa di override.
    open fun accelerate(){
        speed+=10
        println("$brand melaju. kecepatan $speed km/jam")
    }
    open fun honk(){
        println("Bee[ beep!")
    }
}