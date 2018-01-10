package Kotlin_3

// 인자로 받은 함수를 내부에서 실행하는 함수
inline fun doSomething(body : () -> Unit){
    println("onPreExecute()")
    body()
    println("onPostExecute()")
}

fun main(args: Array<String>) {
    doSomething{ println("do Something") }

    // 앞의 구문은 다음과 같이 변환함.
    // 인자로 전달된 함수 본체의 내용이 그대로 복사된 것을 확인할 수 있음.
    // println("onPreExecute()")
    // println("do Something")
    // println("onPreExecute()")
}