package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

class UserValidator {

    fun validate(username: String): Boolean {
        return username.isNotBlank()
    }
}

class UserRepository {

    fun save(username: String) {
        println("Saving $username to database")
    }
}


class EmailService {

    fun sendEmail(email: String) {
        println("Sending email to $email")
    }
}

class UserRegistrationService(
    private val validator: UserValidator,
    private val repository: UserRepository,
    private val emailService: EmailService
) {

    fun register(username: String, email: String) {

        if (!validator.validate(username)) {
            println("Username invalid")
            return
        }

        repository.save(username)
        emailService.sendEmail(email)
    }
}