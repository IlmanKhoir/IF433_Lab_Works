package oop_00000107437_MuhammadFadhilIlmanKhoir.week8.TugasMandiri

sealed class Product
data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
data class Clothing(val id: String, val name: String, val size: String) : Product()