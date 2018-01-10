package Kotlin_3

class Triple(var first : Int, var second : Int, var third : Int)

// Triple[index]가 값을 반환하는 경우 호출되는 함수를 재정의함.
operator fun Triple.get(index : Int) = when(index){
    0 -> this.first
    1 -> this.second
    2 -> this.third
    else -> IllegalAccessException()
}

// Triple[index]에 값이 할당되는 경우, 호출되는 함수를 재정의함.
operator fun Triple.set(index: Int, value : Int){
    when(index){
        0 -> this.first = value
        1 -> this.second = value
        2 -> this.third = value
        else -> IllegalAccessException()
    }
}

fun main(args : Array<String>){
    var triple = Triple(10, 20, 30)

    // triple 객체 내 first, second, third 프로퍼티의 값을 출력함.
    // 10 20 30이 출력됨.
    println("${triple[0]} ${triple[1]} ${triple[2]}")

    // triple 객체 내 first, second 프로퍼티의 값을 변경함.
    triple[0] = 30
    triple[1] = 30

    // 30 30 30이 출력됨.
    println("${triple[0]} ${triple[1]} ${triple[2]}")
}