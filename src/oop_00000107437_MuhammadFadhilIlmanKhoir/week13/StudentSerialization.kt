package oop_00000107437_MuhammadFadhilIlmanKhoir.week13

// --- CHECKPOINT 7 ---
data class Student(val name: String, val age: Int, val gpa: Double)

// --- CHECKPOINT 8 ---
// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name,$age,$gpa"