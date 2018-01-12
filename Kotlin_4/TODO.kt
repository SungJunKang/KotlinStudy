package Kotlin_4

// fun TODO() : Notrhing
// NotImplementedError 예외를 발생시켜 이 부분이 아직 완성되지 않았음을 알려줌.

// fun TODO(reason : String) : Nothing
// NotImplementedError 예외를 발생시켜 이 부분이 아직 완성되지 않았음을 알려줌.
// 에러 메시지에 표시될 상세 내용을 reason 매개변수를 통해 전달할 수 있음.

class Car{
    // 내부 구현이 완료된 함수
    fun drive(){
        val speed = 10
        println("Speed : $speed")
    }

    // 내부 구현이 아직 완료되지 않은 함수
    // 이 함수를 호출할 경우 NotImplementedError 가 발생함.
    fun stop(){
        TODO("Brake is not implemented")
    }
}