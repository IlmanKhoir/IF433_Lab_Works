package oop_00000107437_MuhammadFadhilIlmanKhoir.week02

import java.util.Scanner

fun main(){
    val scnanner = Scanner(System.`in`)
    println("---LIBRARY FINE SIYSTEM")

    println("JUDUL : ")
    val bookTitle = scnanner.nextLine()

    println("peminjam : ")
    val borrower = scnanner.nextLine()

    println("Lama Pinjam; ")
    var loanduration = scnanner.nextInt()

    val loan = Loan (bookTitle, borrower, loanduration)

    val fine = loan.calculateFine()

    if (loanduration < 0){
        println("WARNING: LAMA PINJAM TIDAK BOLEH MINUS. DIUBAH MENJADI 1 HARI")
        loanduration = 1
    }

    println("\n Detail denda Peminjaman")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanduration} hari")
    println("Denda: Rp $fine")
}

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanduration: Int = 1, // default
){
    constructor(bookTitle: String, borrower: String): this (bookTitle,borrower, 1)
    fun calculateFine(): Int {
        return if (loanduration > 3) {
            (loanduration - 3 ) * 2000
        } else {
          0
        }
    }
}