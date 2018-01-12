package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // 기본 설정값을 사용하여 문자열 형태로 조합함.
    println(cities.joinToString())
    println()

    // 구분자로 다른 문자를 사용하도록 함.
    // 구분자 이외에도 다른 설정을 변경할 수 있음. 자세한 사항은 레퍼런스 문서 참고
    println(cities.joinToString(separator = "|"))
}