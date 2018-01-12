package Kotlin_4

fun main(args: Array<String>) {
    val cities = listOf("Seoul", "Tokyo", "Mountain View")

    // 도시 이름의 길이가 5이하면 "A" 그룹에, 그렇지 않으면 "B" 그룹에 대입함.
    // 여기에서 지정하는 이름은 반환되는 맵의 키 이름으로 사용됨.
    cities.groupBy{ city -> if(city.length <= 5) "A" else "B" }
            .forEach{ key, cities -> println("key = $key cities $cities") }
}