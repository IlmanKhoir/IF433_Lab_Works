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