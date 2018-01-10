package Kotlin_2

fun checkAge(age : Int){
    if(age < 0){
        throw IllegalAccessException("Invalid age : $age")
    }
}