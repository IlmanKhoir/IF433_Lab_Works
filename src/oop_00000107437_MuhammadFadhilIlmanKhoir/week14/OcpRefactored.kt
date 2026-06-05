package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

interface DiscountStrategy {
    fun applyDiscount(price: Double): Double
}

class VipDiscount : DiscountStrategy {
    override fun applyDiscount(price: Double): Double {
        return price * 0.8
    }
}

class RegularDiscount : DiscountStrategy {
    override fun applyDiscount(price: Double): Double {
        return price * 0.9
    }
}