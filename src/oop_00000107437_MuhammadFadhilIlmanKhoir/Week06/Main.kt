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

    //TUGAS MANDIRI
    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()

    println("\nMematikan semua perangkat...")
    hub.turnOffAllSwitches()
}