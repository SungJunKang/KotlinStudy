package Kotlin_1

fun main(args : Array<String>){
    greet("강성준")
    println("1 + 2 = ${sum(1,2)}")
}

fun greet(name : String) : Unit{ // Unit : Java 의 void 와 유사하게 사용되며 생략이 가능함.
    println("Hello, $name!")
}

fun sum(a : Int, b : Int) : Int{
    return a + b
}