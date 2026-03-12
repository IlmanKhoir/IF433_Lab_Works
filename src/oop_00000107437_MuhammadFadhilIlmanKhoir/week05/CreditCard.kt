package oop_00000107437_MuhammadFadhilIlmanKhoir.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil membayar Rp$amount dengan Credit Card")
            println("Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak, melebihi limit")
        }

    }
}