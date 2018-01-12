package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View")

    // 도시 이름의 길이가 5이하일 경우에는 이를 그대로 반환하고,
    // 그렇지 않은 경우 null 값을 반환함.
    cities.mapNotNull{ city -> if(city.length <= 5) city else null }.forEach{ println(it) }
}