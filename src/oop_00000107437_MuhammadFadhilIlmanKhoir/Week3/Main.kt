package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3

fun main(){
    val weapon = weapon("Excalibur")

    // test damage -50 (harus gagal)
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    // test damage 9999 (harus jadi 1000)
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    // print tier
    println("Tier weapon: ${weapon.tier}")
}