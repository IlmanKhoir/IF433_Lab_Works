package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

//ERROR: CLASS SMARTPHONE INHERITS MULTIPLE IMPLEMENTATION OF TURNON()
class Smartphone: camera, phone{
    override fun turnOn() {
        super<camera>.turnOn() // MENJALANKAN LOGIKA CAMERA
        super<phone>.turnOn() // MENJALANKAN LOGIKA PHONE
        println("SISTEM OPERASI SMARTPHONE BERHASIL BOOTING")
    }
}