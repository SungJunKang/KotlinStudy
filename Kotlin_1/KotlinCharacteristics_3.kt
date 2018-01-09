package Kotlin_1

fun main(args : Array<String>){
    // String 타입의 값 foo 를 선언함.
    // Java 의 final String foo = "foo";와 동일함.
    val a : String = "Sunrin"

    // 컴파일 에러 : 값이 한번 할당되면 다른 값을 할당할 수 없음.
    // a = "Internet"

    // String 타입의 변수 bar 를 선언함.
    // Java 의 String bar = "bar";와 동일함.
    var b : String = "High"
    println("${b}")

    // 성공 : var 로 선언되었기 때문에 얼마든지 다른 값을 할당할 수 있음.
    b = "School"
    println("${b}")
}