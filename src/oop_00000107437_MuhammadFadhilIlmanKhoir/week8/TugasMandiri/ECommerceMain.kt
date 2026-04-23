package oop_00000107437_MuhammadFadhilIlmanKhoir.week8.TugasMandiri

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown Type
    )
    val parser = ApiParser()
    println("=== STARTING E-COMMERCE PIPELINE ===")
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("Processing Product: $it")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("ALERT: Data korup tertangkap! ${e.message}")
        }
    }
}
