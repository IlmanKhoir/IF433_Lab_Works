package oop_00000107437_MuhammadFadhilIlmanKhoir.Week3

import jdk.jfr.DataAmount

class Player (val username: String){
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1
    fun addXp(amount: Int) {
        if (amount <= 0){
            println("XP harus positif")
            return
        }
        val oldlevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldlevel){
            println("Level UP! selamat $username naik ke level $newLevel")
        }
    }
}

