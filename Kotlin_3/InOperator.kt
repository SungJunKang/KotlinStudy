package Kotlin_3

class Line(val start : Int, val end : Int)

// 'in' 연산자를 재정의함.
// 주어진 점이 선의 시작점과 끝점 내에 있는지 학인함.
operator fun Line.contains(point : Int) : Boolean{
    return point in start..end
}

fun main(args: Array<String>) {
    val line = Line(0, 10)

    // 점 5와 -1이 선 내에 포함되는지, 그리고 -1이 선 내에 포함되지 않는지 여부를 확인함.
    // true false true 가 출력됨.
    println("${5 in line} ${-1 in line} ${-1 !in line}")
}