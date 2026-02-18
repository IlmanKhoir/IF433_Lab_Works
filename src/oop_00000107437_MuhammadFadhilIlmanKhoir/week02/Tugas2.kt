package oop_00000107437_MuhammadFadhilIlmanKhoir.week02

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)
    println("--Mini RPG BATTLE")
    
    print("MASUKAN NAMA HERO: ")
    val name = scanner.nextLine()
    
    print("MASUKAN BASE DAMAGE HERO: ")
    val baseDamage = scanner.nextInt()
    
    val hero = Hero(name, baseDamage)
    var enemyHp = 100
    
    print("\n pertandingan dimulai...")

    while (hero.masihHidup() && enemyHp > 0) {

        println("\nHP Hero: ${hero.hp} | HP Enemy: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        when (choice) {

            1 -> {
                hero.attack("Monster")

                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("Monster terkena ${hero.baseDamage} damage!")

                if (enemyHp > 0) {
                    val enemyDamage = Random.nextInt(10, 21)
                    println("Monster membalas sebesar $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                }
            }

            2 -> {
                println("${hero.name} kabur dari pertarungan!")
                break
            }

            else -> println("Pilihan tidak valid!")
        }
    }
}
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