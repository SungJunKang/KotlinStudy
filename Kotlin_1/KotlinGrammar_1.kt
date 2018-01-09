package Kotlin_1

fun main(args : Array<String>){
    // String 타입을 갖는 값 a 선언
    val a : String = "Sunrin"

    // 할당하는 자료의 타입에 따라 자동으로 타입을 추론하므로 타입을 생략할 수 있음.
    val b = "Internet"

    // 선언 시 자료를 할당하지 않으면 타입을 꼭 붙여야함.
    val c : String

    // 자료 할당
    c = "High"

    // 변수 d 선언
    var d : Int = 0

    // 변수 값 변경
    d += 1
}