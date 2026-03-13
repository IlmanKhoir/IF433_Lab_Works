package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("processing RP.$amount via Gopay Server")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for RP.$amount")
    }
}