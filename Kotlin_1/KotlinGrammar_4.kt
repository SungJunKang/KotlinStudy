package Kotlin_1

fun main(args : Array<String>){
    val a : Int = 5
    val b : Int = 7

    println(max(a, b))
}

fun max(a : Int, b : Int) : Int{
    if(a > b){
        return a
    }
    else{
        return b
    }
}