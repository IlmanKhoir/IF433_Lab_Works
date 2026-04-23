package oop_00000107437_MuhammadFadhilIlmanKhoir.week8

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser: UserProfile? = null

    // Di Unit Testing, kita ingin test segera berhenti/crash jika data test null
    try {
        val name = testUser!!.name
        println("User name: $name")
    } catch (e: NullPointerException) {
        println("Test Failed: User data is null as expected in this trial.")
    }
}