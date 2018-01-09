package Kotlin_1

fun main(args : Array<String>){
    val items = listOf(10, 2, 3, 5, 6)

    // 리스트 내 항목 중 짝수의 합을 구합니다.
    val sumOfEvens = items.filter { it % 2 == 0 }.sum()

    println("${sumOfEvens}")
}