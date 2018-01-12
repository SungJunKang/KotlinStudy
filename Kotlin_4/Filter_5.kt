package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "Seoul", "Tokyo")

    // 도시 목록 중 중복된 항목을 제거함.
    cities.distinct().forEach{ println(it) }
    println()

    // 중복된 항목을 판단할 때, 도시 이름의 길이를 판단 기준으로 사용함.
    cities.distinctBy{ city -> city.length }.forEach{ println(it) }
}