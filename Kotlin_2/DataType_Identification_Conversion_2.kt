package Kotlin_2

fun main(args: Array<String>) {
    val a : Pair<Char, Int> = Pair('A', 65)
    val b = a
    val c : Pair<Char, Int> = Pair('A', 65)

    // a와 b의 값이 동일하므로 true
    val aEqualsTob : Boolean = a == b
    println(aEqualsTob)

    // a와 c의 값이 동일하므로 true
    val aEqualsToc : Boolean = a == c
    println(aEqualsToc)

    // a와 b는 동일한 객체이므로 true
    val aIdenticalTob : Boolean = a === b
    println(aIdenticalTob)

    // a와 b는 동일한 객체가 아니므로 false
    val aIdenticalToc : Boolean = a === c
    println(aIdenticalToc)
}