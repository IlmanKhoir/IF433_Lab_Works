package oop_00000107437_MuhammadFadhilIlmanKhoir.week10.tugasmandiri

fun main() {
    val coinRepo = WalletRepository<coin>()

    coinRepo.add(coin("BTC", 0.5))
    coinRepo.add(coin("ETH", 10.0))
    coinRepo.add(coin("USDT", 2500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Aset: ${coin.name}, Saldo: ${coin.balance}")
    }
}