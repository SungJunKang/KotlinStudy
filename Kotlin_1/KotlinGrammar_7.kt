package Kotlin_1

fun main(args : Array<String>){
    val items = listOf("Sunrin", "Internet", "High", "School")
    var i = 0
    while(i < items.size){
        println("items : ${items[i]}")
        i++
    }
}