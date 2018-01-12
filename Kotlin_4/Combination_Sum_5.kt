package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // fold 함수의 초기값으로 "Initial" 문자를 대입함.
    println(cities.fold("Initial"){ acc, s -> "$acc, $s" })
    println()

    // foldRight 함수는 마지막 인자부터 조함함.
    println(cities.foldRight("Initial"){ s, acc -> "$acc, $s" })
    println()
}