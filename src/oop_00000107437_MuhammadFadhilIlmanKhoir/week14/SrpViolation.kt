package oop_00000107437_MuhammadFadhilIlmanKhoir.week14
class UserManager {

    fun registerUser(username: String, email: String) {

        // Validation
        if (username.isBlank()) {
            println("Username tidak boleh kosong")
            return
        }

        // Save database
        println("Saving $username to database")

        // Send email
        println("Sending email to $email")
    }
}

fun main() {
    val userManager = UserManager()
    userManager.registerUser("Fadhil", "fadhil@gmail.com")
}