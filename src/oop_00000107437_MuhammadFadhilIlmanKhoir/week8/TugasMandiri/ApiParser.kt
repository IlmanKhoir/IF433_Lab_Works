package oop_00000107437_MuhammadFadhilIlmanKhoir.week8.TugasMandiri

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Validasi keberadaan data krusial
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12 // Fallback ke 12 bulan
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size" // Fallback ke All Size
                Clothing(id, name, size)
            }
            else -> null // Tipe tidak dikenal di-skip
        }
    }
}