package oop_00000107437_MuhammadFadhilIlmanKhoir.week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            // Smart cast terjadi di sini
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}