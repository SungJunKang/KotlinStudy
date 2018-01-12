package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // cities 리스트 내에 자료가 존재하지 않는지 확인함.
    println(cities.none())
    println()

    // 빈 문자열을 가진 자룍 존재하지 않는지 확인함.
    println(cities.none{ city -> city.isEmpty() })
}