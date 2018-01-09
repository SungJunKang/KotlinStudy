package Kotlin_1

fun main(args : Array<String>){
    val a = 1
    val b = 2

    countItems(a)
    countItems(b)
}

fun countItems(count : Int){
    when(count){ // when : Java 의 switch와 동일한 역할
        1 -> println("There is $count item")
        else -> println("There are $count items")
    }
}