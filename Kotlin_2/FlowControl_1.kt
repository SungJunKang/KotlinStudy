package Kotlin_2

fun main(args: Array<String>) {
    val age : Int = 25
    val ageRange : String = if(age >= 10 && age < 20){
        "10대"
    }
    else if(age >= 20 && age < 30){
        "20대"
    }
    else if(age >= 30 && age < 40){
        "30대"
    }
    else{
        "기타"
    }

    println(ageRange)
}