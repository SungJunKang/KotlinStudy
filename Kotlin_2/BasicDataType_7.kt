package Kotlin_2

fun main(args : Array<String>){
    val text : String = "Sunrin Internet"

    // "TextLength : 4" 할당
    val lengthText : String = "TextLength : ${text.length}"

    println(lengthText)

    // ------------------------------------------------------

    val price : Int = 1000

    // "Price : $1000" 할당
    val priceText : String = "Price : ${'$'}$price"

    println(priceText)
}