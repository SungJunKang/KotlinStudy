package Kotlin_3

fun main(args: Array<String>) {
    val cities : Map<String, String> = mapOf()

    // 람다 표현식 내 매개변수에서도 분해 선언을 사용할 수 있음.
    cities.forEach{cityCode, name ->
        System.out.println("$cityCode = $name")
    }
}