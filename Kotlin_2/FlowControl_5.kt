package Kotlin_2

fun main(args: Array<String>) {
    val names : List<String> = listOf("Kang", "Kim", "Lee")

    // 변수 name 의 타입은 리스트 names 를 통해
    // String 으로 추론하므로 타입을 적지 않아도 됨.
    for(name in names){
        // 이름과 함께 출력
        println("name : $name")
    }
}