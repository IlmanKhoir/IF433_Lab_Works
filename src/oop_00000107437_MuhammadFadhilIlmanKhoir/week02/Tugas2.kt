package oop_00000107437_MuhammadFadhilIlmanKhoir.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
){
    fun attack(targetname: String){
        println("$name menebas $targetname!")
    }
    fun takeDamage(damage: Int){
        hp -= damage

        //hero menerima damage
        if (hp <= 0){
            hp = 0
        }
    }
    fun masihHidup(): Boolean{
        return hp > 0
    }
}