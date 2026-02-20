package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3

class Employee(val name : String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke:  $value")
            this.salary = value
        }
}

fun main(){
    val e = Employee("Budi")
    print("====Test Eror=======")
    e.salary = 5000 // ini adak meledakan program anda
}