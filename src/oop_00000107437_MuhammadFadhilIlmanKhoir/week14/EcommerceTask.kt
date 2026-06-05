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