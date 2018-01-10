package Kotlin_2

fun main(args : Array<String>){
    val immutableMap : Map<String, Int> = mapOf(Pair("A", 65), Pair("B", 66))

    // 키 "A"에 해당하는 값 - get("A")와 동일
    val code : Int? = immutableMap["A"]

    // 컴파일 에러 : 값 설정 - put("C", 67)과 동일
    // immutableMap["C"] = 67

    val mutableMap : HashMap<String, Int> = hashMapOf(Pair("A", 65), Pair("B", 66))
    println(mutableMap)

    // 자료 변경 가능 - "C" 키로 값 67 삽입
    mutableMap["C"] = 67
    println(mutableMap)
}