package Kotlin_2

fun main(args: Array<String>){
    val a : String = "Sunrin Internet"

    // ch1 에 인덱스가 4인 문자 'r' 할당
    val ch1 : Char = a.get(4)

    // ch2 에 인덱스가 8인 문자 'n' 할당
    val ch2 : Char = a[8]

    println("ch1 : $ch1, ch2 : $ch2")
}