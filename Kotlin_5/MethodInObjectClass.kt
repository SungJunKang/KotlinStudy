package Kotlin_5

import kotlin.reflect.KClass

fun main(args: Array<String>) {
    val str = "Sunrin"

    // Java Object 클래스의 wait() 메서드를 호출함.
    // (str as java.lang.Object).wait()

    // Java Object 클래스의 notify 클래스를 호출함.
    // (str as java.lang.Object).notify()

    // ::class 를 사용하면 객체의 코틀린 클래스로 반환함.
    val kotlinClass : KClass<out String> = str :: class

    // ::class.java 를 사용하면 객체의 Java 클래스로 반환함.
    val javaClass : Class<out String> = str :: class.java
}

// kotlin.Cloneable 인터페이스를 구현함.
class Person1(val name : String, val address : String) : Cloneable{
    // clone() 함수를 작성함.
    // override fun clone() : Any{
        // ....
    // }
}

class Person2(val name : String, val address: String){
    // 일반 함수를 정의하는 것과 동일하게 작성함.
    protected fun finalize(){
        // ....
    }
}