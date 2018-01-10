package Kotlin_3

data class Person(val name : String, val address : String) // Java 의 getter, setter 만든 거랑 똑같은 기능

fun main(args : Array<String>){
    val Kang = Person("KangSJ", "SomeWhere")
    val Kang2 = Person("KangSJ", "SomeWhere")
    val Do = Person("Do", "AnyWhere")

    println("Kang == Kang2? = ${Kang == Kang2}")
    println("Kang == Do? = ${Kang == Do}")
    println("Kang.hashCode() = ${Kang.hashCode()}")

    // Kang.toString()
    println("Kang = $Kang")

    // Do.toString()
    println("Do = $Do")
}