package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

class Smartwatch : Watch(), BluetoothConnectable, Recharge {
    override fun showtime(){
        println("Layar, OLED menyala: 14:00 WIB")
    }

    override fun connnectToBluetooth(){
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15w.")
    }
}