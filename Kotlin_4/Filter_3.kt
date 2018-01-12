package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // 첫 번째 인자로부터 하나의 인자를 제외함.
    cities.drop(1).forEach{ println(it) }
    println()

    // 마지막 인자로부터 두 개의 인자를 제외함.
    cities.dropLast(2).forEach{ println(it) }
    println()

    // 문자열의 길이가 5이하인 조건을 만족할 때 까지 해당하는 항목을 제외함.
    // "NYC"와 "Singapore"도 문자열의 길이가 5이하이지만,
    // "Mountain View"가 조건을 만족하지 않으므로 이후의 인자들은 모두 무시합니다.
    cities.dropWhile{ city -> city.length <= 5 }.forEach{ println(it) }
    println()

    // 뒤에서부터 시작하여, 문자열의 길이가 13 미만인 조건을 만족할 때까지 해당하는 항목을 제외함.
    // 컬렉션 내 항목의 순서는 유지됨.
    cities.dropLastWhile{ city -> city.length < 13 }.forEach{ println(it) }
}