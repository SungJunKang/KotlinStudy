package Kotlin_2

fun main(args : Array<String>){
    // 컴파일 에러 : Char 자료형 값에 Int 자료형인 65 대입 불가
    // val c : Char = 65

    // 성공
    val c : Char = 'A'

    // ------------------------------------------------------

    // 문자 'A'의 아스키 코드 값
    val code : Int = 65

    // code 에 해당하는 문자를 할당
    val ch : Char = code.toChar()
}