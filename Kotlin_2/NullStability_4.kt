package Kotlin_2

fun main(args: Array<String>) {
    val kang : String = "Kang"

    // sung 이 null 값을 허용하도록 Int?로 정의함.
    // 자료형 반환에 실패하므로 sung 에는 null 값이 할당됨.
    val sung : Int? = kang as? Int
}