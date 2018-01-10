package Kotlin_2

fun main(args : Array<String>){
    val myRange : IntRange = 0..10 // 범위 지정

    // 5가 myRange 내에 포함되어 있는지 확인함. : true 반환
    val foo : Boolean = 5 in myRange

    // 5가 myRange 내에 포함되지 않는지 확인함. : false 반환
    val bar : Boolean = 5 !in myRange

    println("foo : $foo, bar : $bar")
}