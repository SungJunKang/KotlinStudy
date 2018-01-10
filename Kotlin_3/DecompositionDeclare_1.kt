package Kotlin_3

data class Person2(val age : Int, val name : String)

fun main(args: Array<String>) {
    val person : Person2 = Person2(19, "Kang")

    // 사람 객체에 포함된 필드의 값을 한번에 여러 값(val)에 할당함.
    val (ageOfPerson, nameOfPerson) = person

    // 컴파일
    // val ageOfPerson : Int = person.component1()
    // val nameOfPerson : String = person.component2()
}