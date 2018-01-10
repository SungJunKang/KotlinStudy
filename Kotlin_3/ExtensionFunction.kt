package Kotlin_3

// String 클래스에 withPostfix() 함수를 추가함.
// this 를 사용하여 인스턴스에 접근할 수 있음.
private fun String.withPostfix(postfix : String) = "$this$postfix"

// this 를 사용하여 인스턴스에 접근할 수 있으므로, 앞에서 정의한 확장 함수를 사용할 수 있음.
fun String.withBar() = this.withPostfix("Bar")

fun main(args: Array<String>) {
    val foo = "Foo"

    // String 클래스에 포함된 함수를 호출하듯이 사용함.
    // 값 foobar 에는 "Foobar"가 할당됨.
    val foobar = foo.withBar()
}