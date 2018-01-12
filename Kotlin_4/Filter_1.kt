package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View")

    // 도시 이름의 길이가 5이하인 항목만 통과시킴.
    cities.filter { city -> city.length <= 5 }.forEach{ println(it) }
}