package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

interface Clickable{
    val name: String // abstrack property, tidak ada nilai default

    fun click()
}

class Button(override val name: String) : Clickable{
    override fun click() {
        println("Tombol $name berhasil diklik")
    }
}