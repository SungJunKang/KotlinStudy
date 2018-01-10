package Kotlin_3

// 반지름의 기본값으로 25를 갖는 함수
fun drawCircle1(x : Int, y : Int, radius : Int = 25){

}

fun main(args: Array<String>) {
    // 중심축이 (10, 5)인 원을 그림.
    // 반지름을 지정하지 않았으므로 원의 반지름은 25가 됨.
    drawCircle1(10, 5)
}
