package oop_00000107437_MuhammadFadhilIlmanKhoir.week13

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