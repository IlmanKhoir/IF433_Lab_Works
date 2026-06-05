package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

class DiscountCalculator {

    fun calculate(price: Double, customerType: String): Double {

        return when (customerType) {
            "VIP" -> price * 0.8
            "REGULAR" -> price * 0.9
            else -> price
        }
    }
}