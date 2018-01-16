package Kotlin_5

fun main(args: Array<String>) {
    // 코틀린에서 생성한 클래스와 동일하게 객체를 생성할 수 있음.
    val person = Person("KangSungJun", "SomeWhere")

    // getName(), getAddress() 메서드를 프로퍼티의 값을 읽는 방법과 동일하게 사용함.
    println("name : ${person.name}, address : ${person.address}")
    println()

    // 오류 : setName() 메서드가 없으므로 사용할 수 없음.
    // person.name = "GangSungJun"

    // 성공 : setAddress() 메서드가 있으므로, 프로퍼티 값을 대입하는 방법과 동일하게 값을 대입할 수 있음.
    person.address = "Nowhere"
    println("name : ${person.name}, address : ${person.address}")
}