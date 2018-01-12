package Kotlin_4

fun main(args: Array<String>) {
    val numbers = 1..6

    // 1부터 시작하여 각 인자를 끝으로 하는 범위를 반환함.
    numbers.flatMap{ number -> 1..number }.forEach{ print("$it ") }
}