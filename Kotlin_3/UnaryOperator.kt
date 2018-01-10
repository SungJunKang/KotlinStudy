package Kotlin_3

class Volume(var left : Int, var right : Int){
    // 단항 연산자 '-'를 재정의함.
    operator fun unaryMinus() : Volume{
        this.left = -this.left
        this.right = -this.right
        return this
    }

    // 단항 연산자 '+'를 재정의함.
    operator fun inc() : Volume{
        this.left += 1
        this.right += 1
        return this
    }

    // 단항 연산자 '--'를 재정의함.
    operator fun dec() : Volume{
        this.left -= 1
        this.right -= 1
        return this
    }
}

fun main(args : Array<String>){
    var volume = Volume(50, 50)

    // Volume 클래스 내 left, right 값이 반전되어 할당됨.
    val v1 = -volume

    // volume 객체의 left, right 값이 각각 1씩 증가함.
    volume++

    // volume 객체의 left, right 값이 각각 1씩 감소함.
    volume--
}