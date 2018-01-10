package Kotlin_2

fun main(args: Array<String>) {
    val number : Int = 20
    val str : String = if(number % 2 == 0)
        "Even" else "Odd"

    println(str)
}