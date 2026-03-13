package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

interface Clickable{
    //Eror Property in a interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    //function without body (implicitly abstrack)
    fun click()
}