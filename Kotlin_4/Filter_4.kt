package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View", "NYC", "Singapore")

    // 첫 번째 인자를 반환함.
    println(cities.first())
    println()

    // 마지막 인자를 반환함.
    println(cities.last())
    println()

    // 문자열 길이가 5이상인 첫 번째 인자를 반환함.
    println(cities.first{ city -> city.length > 5 })
    println()

    // 문자열 길이가 5이상인 마지막 인자를 반환함.
    println(cities.last{ city -> city.length > 5 })
    println()

    try{
        // 조건을 만족하는 첫 번째 인자를 반환하며, 없을 경우 null 값을 반환함.
        cities.first{ city -> city.isEmpty() }
    } catch(e : NoSuchElementException){
        println("Not found")
        println()
    }

    try{
        // 조건을 만족하는 마지막 인자를 반환하며, 없을 경우 null 값을 반환함.
        cities.last{ city -> city.isEmpty() }
    } catch(e : NoSuchElementException){
        println("Not found")
        println()

    }

    // 조건을 만족하는 첫 번째 인자를 반환하며, 없을 경우 null 값을 반환함.
    println(cities.firstOrNull{ city -> city.isEmpty() })
    println()

    // 조건을 만족하는 마지막 인자를 반환하며, 없을 경우 null 값을 반환함.
    println(cities.lastOrNull{ city -> city.isEmpty() })
}