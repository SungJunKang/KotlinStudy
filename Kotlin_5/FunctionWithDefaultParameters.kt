package Kotlin_5

// 기본 매개변수가 있는 주 생성자에 @JvmOverloads 어노테이션을 적용함.
class Person3 @JvmOverloads constructor(val name : String, var address : String = "", var isAdult : Boolean = false){
    // 기본 매개변수가 있는 함수에 @JvmOverloads 어노테이션을 적용함.
    @JvmOverloads
    fun doSomething(a : String, b : Int = 0, c : Boolean = false){
    }
}