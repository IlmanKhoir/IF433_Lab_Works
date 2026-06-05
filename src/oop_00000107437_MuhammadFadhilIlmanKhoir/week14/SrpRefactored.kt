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