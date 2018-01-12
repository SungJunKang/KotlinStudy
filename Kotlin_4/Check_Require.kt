package Kotlin_4

// fun check(value : Boolean)
// 인자로 받은 value 값이 참이 아니라면 IllegalStateException 을 발생시킴

// fun check(value : Boolean, lazyMessage : () -> Any)
// 인자로 받은 value 값이 참이 아니라면 IllegalStateException 을 발생시키며,
// 이때 lazyMessage 로 넘겨진 함수를 함께 실행함.

// fun require(value : Boolean)
// 인자로 받은 value 값이 참이 아니라면 IllegalArgumentException 을 발생시킴.

// fun require(value : Boolean, lazyMessage : () -> Any)
// 인자로 받은 value 값이 참이 아니라면 IllegalArgumentException 을 발생시키며,
// 이때 lazyMessage 로 넘겨진 함수를 함께 실행함.

fun showMessage(isPrepared : Boolean, message : String){
    // 인자로 받은 isPrepared 값이 true 가 아니라면 IllegalStateException 을 발생시킴.
    check(isPrepared)
    // 인자로 받은 message 문자열의 길이가 10 이상이 아니라면 IllegalArgumentException 을 발생시킴.
    require(message.length > 10)

    // 값 msg에는 인자로 받은 message 값이 null 값이 아닐 때에만 값이 할당됨.
    val msg = requireNotNull(message)
    require(message.length > 10)

    println(message)
}