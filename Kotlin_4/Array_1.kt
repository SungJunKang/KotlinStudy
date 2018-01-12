package Kotlin_4

// fun <T> arrayOf(vararg elements : T) : Array<T>
// 함수의 인자로 받은 값으로 구성된 배열을 반환함.

// fun <T> emptyArray() : Array<T>
// 특정 타입을 갖는 빈 배열을 반환함.

// fun <T> arrayOfNulls(size : Int) : Array<T>
// 배열 내 각 값들이 모두 null 값으로 초기화되어 있고,
// 인자로 받은 size 만큼의 크기를 갖는 배열을 반환함.

fun main(args: Array<String>) {
    // 인자로 전달된 문자열을 포함하는 배열을 생성함.
    // 배열의 타입은 인자를 통해 추론되므로 별도로 표기하지 않아도 됨.
    val cities = arrayOf("Seoul", "Tokyo", "San Francisco")

    // String 타입의 빈 배열을 생성함.
    // 전달되는 인자가 없어 타입 추론이 불가하므로 함수 호출 시 타입을 지정해 주어야 함.
    val emptyStringArray = emptyArray<String>()

    // 크기가 3이고 null 값을 포함할 수 있는 배열을 생성함.
    // 전달되는 인자가 없어 타입 추론이 불가하므로 함수 호출 시 타입을 지정해 주어야 함.
    val nullStoreableArray = arrayOfNulls<String>(3)
}