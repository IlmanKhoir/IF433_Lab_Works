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

   print("PILIH JALUR (1. REGULAR, 2. UMUM): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1 ){
        print("masukan jurusan: ")
        val major = scanner.nextLine()
        //memanggil primary constructor
        val s1 = Student(name, nim, major)
        println("TERDAFTAR DI: ${s1.major} DENGAN GPA AWAL ${s1.gpa}")
    } else if(type == 2 ){
        val s2 = Student(name, nim)
        println("TERDAFTAR DI: ${s2.major} DENGAN GPA AWAL ${s2.gpa}")
    }else {
        println("PILIHAN NGAWUR, PENDAFTARAN BATAL")
    }
}

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0 // default argument
)  {
    constructor(name: String, nim: String): this (name, nim, "Non-Matriculated"){
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
