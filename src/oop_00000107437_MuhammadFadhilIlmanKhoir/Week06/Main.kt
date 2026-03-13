package oop_00000107437_MuhammadFadhilIlmanKhoir.Week06

fun processCheckout(method: PaymentMethod, amount:Double){
    println("==> Memulai checkout ...")
    method.pay(amount) // Dynamic polymorpishm in action
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showtime()

    val myphone = Smartphone()
    myphone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n ========= Testing Checkout ========")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 50000.0)
}