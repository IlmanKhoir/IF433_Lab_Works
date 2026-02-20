package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3


class Employee(val name : String){
    var salary: Int = 0
    set(value) {
        if (value < 0){
            println("EROR: Gaji tidak boleh kosong!")
            field = 0
        }else{
            field = value
        }
    }
}

fun main(){
    val e = Employee("Budi")
    print("====Test Eror=======")
    e.salary = 5000 // ini adak meledakan program anda
}