package Kotlin_3

class V1(var left : Int , var right : Int){
    // 멤버로 선언된 함수에 중위 표기를 지원하도록 함.
    infix fun increaseBy(amount : Int){
        this.left += amount
        this.right += amount
    }
}

// 확장 함수로 선언된 함수에 중위 표기를 지원하도록 함.
infix fun V1.decreaseBy(amount: Int){
    this.left -= amount
    this.right -= amount
}

fun main(args : Array<String>){
    // 중위 표기를 지원하는 함수를 사용하는 예
    val currentV = V1(50, 50)
    println("left : ${currentV.left}, right : ${currentV.right}")

    // currentV.increaseBy(30)과 동일함.
    currentV increaseBy 30
    println("left : ${currentV.left}, right : ${currentV.right}")

    // currentV.decreaseBy(20)과 동일함.
    currentV decreaseBy 20
    println("left : ${currentV.left}, right : ${currentV.right}")
}