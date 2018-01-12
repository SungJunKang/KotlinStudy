package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // cities 리스트 내에 자료가 존재하는지 확인함.
    println(cities.any())
    println()

    // 문자열 길이가 5이하인 자료가 있는지 확인함.
    println(cities.any{ city -> city.length <= 5 })
}