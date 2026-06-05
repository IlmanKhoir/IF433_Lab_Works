package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

interface MultifunctionDevice {

    fun print()

    fun scan()

    fun fax()
}

class SimplePrinter : MultifunctionDevice {

    override fun print() {
        println("Printing...")
    }

    override fun scan() {
        throw UnsupportedOperationException()
    }

    override fun fax() {
        throw UnsupportedOperationException()
    }
}

interface Printable {
    fun print()
}

interface Scannable {
    fun scan()
}

interface Faxable {
    fun fax()
}