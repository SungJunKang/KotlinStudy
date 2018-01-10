package Kotlin_3

fun main(args : Array<String>){
    class Person(val age : Int, val name : String){
        val adult : Boolean get() = age >= 19 // 19세 이상이면 성인으로 간주함.
        val address : String = ""
        // set(value){
        // field = value.substring(0..9)
        // }
    }
}