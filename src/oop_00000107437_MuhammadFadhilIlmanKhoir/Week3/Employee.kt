package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3


class Employee(val name : String){

    private var performanceRating: Int = 3
    val tax: Double
        get() = salary *0.1
    var salary: Int = 0
    set(value) {
        if (value < 0){
            println("EROR: Gaji tidak boleh kosong!")
            field = 0
        }else{
            field = value
        }
    }
    fun increasePerformanceRating(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }
}

fun main(){
    val e = Employee("Budi")
    print("====Test Eror=======")

    e.salary = -1000
    e.salary = 5000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")
}