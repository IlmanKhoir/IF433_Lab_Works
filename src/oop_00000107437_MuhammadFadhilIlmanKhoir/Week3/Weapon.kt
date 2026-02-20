package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3

class weapon(val name: String) {
    private  var _damage: Int = 0

    var damage: Int
        get() = _damage
        set(value) {
            if (value < 0) {
                println("Warning: damage tidak bisa negatif")
                return
            }
            if (value > 1000){
                _damage = 1000
            } else {
                _damage = value
            }
        }

        val tier: Any
            get() = when{
                damage > 800 -> "lengendery"
                damage >= 500 ->"Epic"
                else -> "Common"
            }
}

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