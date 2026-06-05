package oop_00000107437_MuhammadFadhilIlmanKhoir.week14
import java.io.File
interface OrderRepository {
    fun saveOrder(order: String)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(order: String) {

        File("orders.csv").appendText("$order\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("EMAIL: $message")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.9
    }
}

class SafeOrderProcessor(
    private val repository: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        price: Double,
        strategy: PricingStrategy
    ) {

        val finalPrice = strategy.calculate(price)

        repository.saveOrder(
            "Order Total = $finalPrice"
        )

        notifier.sendNotification(
            "Order berhasil diproses. Total = $finalPrice"
        )
    }
}

fun main() {

    val processor = SafeOrderProcessor(
        CsvOrderRepository(),
        EmailNotifier()
    )

    processor.processOrder(
        100000.0,
        VipPricing()
    )
}