package Kotlin_3

class Volume1(val left : Int, val right : Int)

// 이항 연산자 '+'를 재정의함.
operator fun Volume1.plus(other : Volume1) = Volume1(this.left + other.left, this.right + other.right)

// 이항 연산자 '-'를 재정의함.
operator fun Volume1.minus(other: Volume1) = Volume1(this.left - other.left, this.right - this.right)

fun main(args : Array<String>){
    // v1에는 Volume(30, 40)과 동일한 값이 적용됨.
    val v1 = Volume1(10, 10) + Volume1(20, 30)

    // v2에는 Volume(30, 20)과 동일한 값이 적용됨.
    val v2 = Volume1(50, 30) - Volume1(20, 10)
}

