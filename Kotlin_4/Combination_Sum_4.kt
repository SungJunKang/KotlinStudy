package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // 아래 예는 joinToString 함수와 동일한 형태의 문자열을 만들어줌.
    // acc 에는 지금까지 조합된 결과가, s 에는 새로 조합할 자료가 들어감.
    println(cities.reduce{ acc, s -> "$acc, $s" })
    println()

    // reduceRight 함수는 마지막 인자부터 조합함.
    println(cities.reduceRight{ s, acc -> "$acc, $s" })
}