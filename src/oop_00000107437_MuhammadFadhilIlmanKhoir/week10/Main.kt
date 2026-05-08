package oop_00000107437_MuhammadFadhilIlmanKhoir.week10

fun main() {
    println ("====Testing generic class====")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println("isi intBox : ${intBox.value}")
    println("isi stringBox : ${stringBox.value}")

    println("\n=== test multiple parameters===")
    val itemprice = pairbox("bitcoin", 65000)
    println ("aset : ${itemprice.key}, Herga : ${itemprice.value} USD")

    println("\n === test generic function ===")
    printdata(3.14)
    val result = processdata("stable coin")
    println(result)

    println("\n=== testing constraints ===")
    val math = mathbox(10.5,20)
    println("total ; ${math.sum()}")
    println("terbesar : ${getmax(45,90)}")
}