package oop_00000107437_MuhammadFadhilIlmanKhoir.week13

import java.io.File

// --- CHECKPOINT 7 ---
data class Student(val name: String, val age: Int, val gpa: Double)

// --- CHECKPOINT 8 ---
// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name,$age,$gpa"

// --- CHECKPOINT 9 ---
fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString(separator = "\n") { it.toCsv() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val students = listOf(
        Student(name = "Alice", age = 20, gpa = 3.8),
        Student(name = "Bob", age = 22, gpa = 3.5)
    )

    saveStudents(students, path = "students.csv")

    val loaded = loadStudents(path = "students.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it) }
}