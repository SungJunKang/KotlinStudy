package Kotlin_3

class V(var left : Int, var right : Int)

// '+=' 연산자를 재정의함.
operator fun V.plusAssign(other : Int){
    this.left += other
    this.right += other
}

// '-=' 연산자를 재정의함.
operator fun V.minusAssign(other : Int){
    this.left -= other
    this.right -= other
}

fun main(args : Array<String>){
    val v = V(50, 50)
    println("left : ${v.left}, right : ${v.right}")

    // v 객체의 left, right 값을 20씩 증가시킴.
    v += 20
    println("left : ${v.left}, right : ${v.right}")

    // v 객체의 left, right 값을 10씩 감소시킴.
    v -= 10
    println("left : ${v.left}, right : ${v.right}")
}