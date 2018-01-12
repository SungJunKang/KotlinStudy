package Kotlin_4

fun main(args: Array<String>) {
    // 도시 코드를 담은 리스트로, 4개의 자료를 가지고 있음.
    val cityCodes = listOf("SEO", "TOK", "MTV", "NYC")

    // 도시 이름을 담은 리스트로, 3개의 자료를 가지고 있음.
    val cityNames = listOf("Seoul", "Tokyo", "Mountain View")

    // 단순히 zip 함수를 호출하는 경우, Pair 형태로 자료를 조합함.
    cityCodes.zip(cityNames).forEach{ pair -> println("${pair.first} : ${pair.second}") }
    println()

    // 조합할 자료의 타입을 조합 함수를 통해 지정하면 해당 형태로 바꿔줌
    cityCodes.zip(cityNames){ code, name -> "$code ($name)" }.forEach{ println(it) }
}