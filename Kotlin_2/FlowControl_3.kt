package Kotlin_2

fun main(args: Array<String>) {
    val bags : Int = 1

    when(bags){
        // 각 case 에 해당하는 값만 적음.
        0 -> println("We have no bags")

        // 여러 개의 case 는 쉼표로 구분하여 적음.
        1, 2 -> {
            println("Extra charge required")
            println("We have $bags bag(s)")
        }

        // default 대신 else 로 표현함.
        else -> println("Cannot have more bags")
    }
}