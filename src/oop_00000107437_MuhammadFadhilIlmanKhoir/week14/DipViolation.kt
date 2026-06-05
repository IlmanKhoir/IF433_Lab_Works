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
interface Database {
    fun saveUser(name: String)
}

class MySQLDatabaseImpl : Database {

    override fun saveUser(name: String) {
        println("Saving $name to MySQL")
    }
}

class PostgreSQLDatabase : Database {

    override fun saveUser(name: String) {
        println("Saving $name to PostgreSQL")
    }
}

class BetterUserService(
    private val database: Database
) {

    fun register(name: String) {
        database.saveUser(name)
    }
}