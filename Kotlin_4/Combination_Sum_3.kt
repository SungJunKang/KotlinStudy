package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // 컬렉션 내 포함된 모든 자료의 개수를 반환함.
    println(cities.count())
    println()

    // 컬렉션 내 포함된 자료 중, 길이가 5이하인 자료의 개수를 반환함.
    println(cities.count{ city -> city.length <= 5})
}