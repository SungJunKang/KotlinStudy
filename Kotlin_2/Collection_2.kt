package Kotlin_2

fun main(asgs : Array<String>){
    val immutableList : List<String> = listOf("Sunrin", "Internet", "High")

    // 첫 번째 항목 읽기 - get(0)과 동일
    val firstItem : String = immutableList[0]
    println(firstItem)

    // 컴파일 에러 : 값 설정 - set(0)과 동일
    /// immutableList[0] = "Lollypop"

    val mutableList : MutableList<String> = arrayListOf("Sunrin", "Internet", "High")
    println(mutableList)

    // 자료 변경 가능
    mutableList[0] = "Lollypop"
    println(mutableList)
}