package oop_00000107437_MuhammadFadhilIlmanKhoir.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin( "Bu siti")

    // polymorphic collection: list yang berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)


    println("======= AKTIVITAS PEGAWAI ===========")
    for (pegawai in daftarPegawai)
        //pemanggilan runtime polymorphic
//        pegawai.bekerja() // akan eror karena tipe referensinya adalah pegawai
        when (pegawai) {
            is Dosen -> {
                println("=> terdeteksi sebagai dosen (NIM: ${pegawai.nidn})")
                pegawai.mengajarr() // smart cast! Tidak perlu manuao casting (as)
                }
            is Admin -> {
                println("=> Terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
}