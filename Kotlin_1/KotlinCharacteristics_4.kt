package Kotlin_1

fun main(args : Array<String>){
    // 자료를 변경할 수 없는 리스트 생성.
    val immutable : List<String> = listOf("Sunrin", "Internet", "High")

    // 컴파일 에러 : add() 함수가 정의되어 있지 않음.
    // immutable.add("School")

    // 자료를 변경할 수 있는 리스트 생성.
    val muutable : MutableList<String> = mutableListOf("Sunrin", "Internet", "High")
    println("${muutable}")

    // 성공 : MutableList 에는 자료를 수정할 수 있는 함수가 정의되어 있음.
    muutable.add("School")
    println("${muutable}")
}