package oop_00000107437_MuhammadFadhilIlmanKhoir.week02



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