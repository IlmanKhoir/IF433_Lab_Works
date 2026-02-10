package oop_00000107437_MuhammadFadhilIlmanKhoir.week01


fun calculateStatus(score: Int) = if (score > 75) "lulus" else "tidak lulus"
fun main(){
    //Refactor: gunakan val dan hapus tipe data eksplisit
    val name: String = "Jhon Thor"
    val score: Int = 80

    //refactor: string template
    println("Nama: $name, Nilai: $score" )

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")
    fun calculateStatus(score: Int) = if (score > 75) "lulus" else "tidak lulus"
    println("Status: ${calculateStatus(score)}")
}

