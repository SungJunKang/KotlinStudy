package Kotlin_5

fun main(args: Array<String>) {
    val a = ArrayTest()

    // Java 원시 타입인 int 형 배열이므로 intArray 를 사용함.
    val intArgs = intArrayOf(1, 2, 3, 4, 5)

    // 스프레드 연산자를 사용하여 인자를 전달함.
    a.doSomething(*intArgs)

    // 객체 타입 배열이므로 일반 배열을 사용함.
    val stringArgs = arrayOf("Sunrin", "Internet", "High", "School")

    // 스프레드 연산자를 사용하여 인자를 전달함.
    a.doNothing(*stringArgs)
}