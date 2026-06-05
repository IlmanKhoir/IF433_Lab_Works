package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

class MySQLDatabase {

    fun saveUser(name: String) {
        println("Saving $name to MySQL")
    }
}

class UserService {

    private val database = MySQLDatabase()

    fun register(name: String) {
        database.saveUser(name)
    }
}