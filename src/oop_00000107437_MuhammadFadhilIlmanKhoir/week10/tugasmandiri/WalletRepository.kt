package oop_00000107437_MuhammadFadhilIlmanKhoir.week10.tugasmandiri

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}