package Kotlin_2

fun main(args : Array<String>){
    // 자료를 수정할 수 없는 리스트 생성
    val immutableList1 : List<String> = listOf("Sunrin", "Internet", "High")

    // 컴파일 에러 : 자료 수정을 위한 함수를 지원하지 않음.
    // immutableList.add("School")

    // 자료를 수정할 수 있는 리스트 생성
    val mutableList : MutableList<String> = arrayListOf("Sunrin", "Internet", "High")
    println(mutableList)

    // 자료 수정 가능
    mutableList.add("School")
    println(mutableList)

    // 자료를 수정하지 않는 자료형으로 재할당
    val immutableList2 : List<String> = mutableList

    // 컴파일 에러 : 자료 수정을 위한 함수를 지원하지 않음.
    // immutableList2.add("Yeah!")
}