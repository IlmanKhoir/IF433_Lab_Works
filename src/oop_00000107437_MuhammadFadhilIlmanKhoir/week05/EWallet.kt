package oop_00000107437_MuhammadFadhilIlmanKhoir.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar Rp$amount")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }

    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName top up Rp$amount")
        println("Saldo sekarang: $balance")
    }
}