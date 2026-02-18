package oop_00000107437_MuhammadFadhilIlmanKhoir.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
)  {
    //Body class kososng dulu
    init {
        if (nim.length != 5) {
            println("WARNING: OBJEK TERCIPTA DENGAN NIM ($nim)")
            println("DATA MAHASISWA $name MUNGKIN AKAN BERMASALAH DI SISTEM.")
        } else {
            println("LOG: OBJEK STUDENT $name BERHASIL DIALOKASIKAN DI MEMORY")
        }
    }
}