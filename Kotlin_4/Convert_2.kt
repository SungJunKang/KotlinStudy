package Kotlin_4

fun main(args: Array<String>) {
    // 0부터 10까지 정수를 포함하는 범위
    val numbers = 0..10

    // 변환 함수에서 각 인자와 인덱스를 곱한 값을 반환함.
    numbers.mapIndexed{ idx, number -> idx * number }.forEach{ print("$it ") }
}