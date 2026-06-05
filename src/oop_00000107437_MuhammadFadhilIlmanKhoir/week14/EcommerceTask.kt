package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

class BadOrderProcessor {

    fun processOrder(
        customerType: String,
        email: String,
        price: Double
    ) {

        val finalPrice = when (customerType) {
            "VIP" -> price * 0.8
            "REGULAR" -> price * 0.9
            else -> price
        }

        println("Writing transaction to CSV")
        println("Email sent to $email")
        println("Total : $finalPrice")
    }
}