package Kotlin_2

fun main(args : Array<String>){
    // 0부터 10까지, 시작과 끝을 포함하는 범위를 정의.
    val myRange : IntRange = 0..10

    // 앞에서 정의한 범위 내를 순환하는 for 문
    for(i in myRange){
        // Do Something
    }

    // for 문 내에서 바로 범위를 정의할 수 있음.
    for(i in 0..10){
        // Do Something
    }
}