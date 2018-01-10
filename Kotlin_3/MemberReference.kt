package Kotlin_3

class Person1(val name : String, val age : Int){
    // 성인 여부를 표시하는 프로퍼티
    val adult = age > 19
}

// 전체 사람 목록 중, 성인 이름만 출력함.
fun printAdults(people : List<Person1>){
    // 필터링 조건을 람다 표현식을 사용하여 대입함.
    // 단순히 adult 프로퍼티의 값만 반환함.
    people.filter({person1 -> person1.adult}).forEach{
        println("Name = ${it.name}")
    }

    // 멤버 참조를 사용하여 adult 프로퍼티를 바로 대입함.
    people.filter(Person1 :: adult).forEach{
        println("Name = ${it.name}")
    }
}