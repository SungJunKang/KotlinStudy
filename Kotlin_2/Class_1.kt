package Kotlin_2

// 클래스 본체 없이 클래스를 선언할 수 있음.
class A

// 인터페이스 본체 없이 인터페이스를 선언하는 것도 가능
interface B

// 추상 클래스 선언
abstract class C{
    abstract fun Can()
}

fun main(args: Array<String>) {
    val a : A = A() // new 키워드 생략

    val b = object : C() {
        override fun Can(){
            // 함수 구현
        }
    }
}
