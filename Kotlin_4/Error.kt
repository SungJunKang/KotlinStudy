package Kotlin_4

// fun error(message : String) : Nothing
// 인자로 받은 message 와 함께 IllegalStateException 을 발생시킴.

fun showMessage1(isPrepared : Boolean, message : String){
    // 인자로 받은 값 isPrepared 가 거짓일 경우
    // IllegalStateException : Not prepared yet 예외가 발생함.
    if(!isPrepared){
        error("Not prepared yet")
    }

    print(message)
}