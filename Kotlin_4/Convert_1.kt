package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View")

    // 도시의 이름을 대문자로 변환함.
    cities.map{ city -> city.toUpperCase() }.forEach{ println(it) }

    // 도시의 이름을 받아, 이를 각 이름의 문자열 길이로 변환함.
    cities.map{ city -> city.length }.forEach{ println("length = $it") }
}