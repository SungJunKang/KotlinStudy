package Kotlin_1

class Person(name : String)

fun main(args : Array<String>){
    // 타입을 적지 않아도 타입 추론을 통해 String 타입으로 지정함.
    val name = "KangSungJun"

    // 객체 생성 시 new 키워드를 사용하지 않음.
    val person = Person(name)
}