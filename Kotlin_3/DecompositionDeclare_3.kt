package Kotlin_3

class Person3(val age : Int, val name : String){
    // 첫 번째 프로퍼티의 값을 반환함.
    operator fun component1() = this.age

    // 두 번째 프로퍼티의 값을 반환함.
    // operator fun componet2() = this.name
}

fun main(args: Array<String>) {
    val person : Person3 = Person3(19, "Kang")

    // 분해 선언을 사용할 수 있음.
    // val (age, name) = person

    // name 값만 사용하고 싶은 경우 다음과 같이 선언함.
    // val (_, name) = person
}