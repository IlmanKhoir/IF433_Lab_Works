package oop_00000107437_MuhammadFadhilIlmanKhoir.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}