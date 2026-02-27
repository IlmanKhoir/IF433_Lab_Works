package oop_00000107437_MuhammadFadhilIlmanKhoir.week4

import oop_00000107437_MuhammadFadhilIlmanKhoir.week04.Developer
import oop_00000107437_MuhammadFadhilIlmanKhoir.week04.Manager

fun main(){
    println("---- Testing Vehicle -----")
    val generalVehicle = Vehicle("sepeda ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n ----- Testing Car -----")
    val myCar = Car("Toyota", 4)
    myCar.openTrunck()
    myCar.honk()
    myCar.accelerate()


    println("---- Testing Electric Car ----")
    val tesla = ElectricCar("Tesla", 4, 80)
    tesla.openTrunck()
    tesla.honk()
    tesla.accelerate()

    println("\n---- Testing Employee Hierarchy ----")

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
