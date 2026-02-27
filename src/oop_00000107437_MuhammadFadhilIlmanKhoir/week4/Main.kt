package oop_00000107437_MuhammadFadhilIlmanKhoir.week4

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
}
