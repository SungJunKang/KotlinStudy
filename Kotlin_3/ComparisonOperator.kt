package Kotlin_3

class Rectangle(val width : Int, val height : Int)

// 사각형의 넓이를 비교한 값을 반환함.
operator fun Rectangle.compareTo(other : Rectangle) : Int{
    val myDimesion = this.width * this.height
    val otherDimesion = other.width * other.height
    return myDimesion - otherDimesion
}

fun main(args : Array<String>){
    // 너비 10, 높이 10인 사각형(넓이 = 100)
    val a = Rectangle(10, 10)

    // 너비 2, 높이 10인 사각형(넓이 = 20)
    val b = Rectangle(2, 10)

    // true true false false 가 출력됨.
    println("${a > b} ${a >= b} ${a <= b} ${a < b}")
}