package oop_00000107437_MuhammadFadhilIlmanKhoir.week8

// name adalah Non-Null (wajib), email dan phone adalah Nullable (opsional) [cite: 17]
class UserProfile(
    val name: String, [cite: 18]
    val email: String?, [cite: 19]
val phone: String? = null // Default argument null [cite: 20]
)