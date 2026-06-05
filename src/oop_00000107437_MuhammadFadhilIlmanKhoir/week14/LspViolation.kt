package oop_00000107437_MuhammadFadhilIlmanKhoir.week14

open class Rectangle {

    open var width = 0
    open var height = 0

    fun area(): Int {
        return width * height
    }
}

class Square : Rectangle() {

    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.width = value
            super.height = value
        }
}
interface Shape {
    fun area(): Int
}
class RectangleShape(
    private val width: Int,
    private val height: Int
) : Shape {

    override fun area(): Int {
        return width * height
    }
}

class SquareShape(
    private val side: Int
) : Shape {

    override fun area(): Int {
        return side * side
    }
}