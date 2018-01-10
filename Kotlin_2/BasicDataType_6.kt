package Kotlin_2

fun main(args : Array<String>){
    val length : Int = 3000

    // "Length : 3000 meters" 값 할당
    val lengthText1 : String = String.format("Length : %d meters", length)
    println(lengthText1)

    // 문자열 템플릿 사용하여 "Length : 3000 meters" 값 할당
    val lengthText2 : String = "Length : $length meters"
    println(lengthText2)
}