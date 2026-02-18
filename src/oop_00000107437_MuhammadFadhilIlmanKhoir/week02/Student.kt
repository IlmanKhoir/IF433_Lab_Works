package oop_00000107437_MuhammadFadhilIlmanKhoir.week02

import java.util.Scanner



fun main(){
    val scanner = Scanner(System.`in`)
    println("===APLIKASI PMB UMN===")

    println("Masukan nama: ")
    val name = scanner.nextLine()

    println("Masukan NIM (WAJIB 5 KARAKTER): ")
    val nim = scanner.next()

    scanner.nextLine()//BERSIHKAN BUFFER NEWLINE (PENYAKIT KLASIK SCANNER)

    //VALIDASI DI SISI PEMANGGIL (MAIN)
    if (nim.length != 5){
        println("EROR: PENDAFTARAN DIBATALKAN. NIM HARUS 5 KARAKTER!")
        //PROGRAM BERHASIL DI SINI UNTUK MAHASISWA INI. TIDAK MEMBUAT OBJEK
    } else{
        println("MASUKAN JURUSAN: ")
        val major = scanner.next()

        val s1 = Student(name, nim, major)
        println("STATUS: PENDAFTARAN SELESAI")
    }
}

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0 // default argument
)  {
    constructor(name: String, nim: String): this (name, nim, major = "Non-Matrculated"){
        println("LOG: MENGGUNAKAN CONTRUCTOR JALUR UMUM (TANPA JURUSAN)")
    }
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
