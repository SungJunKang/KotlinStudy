package Kotlin_4

// fun <K, V> mapOf(vararg pairs : Pair<K, V>) : Map<K, V>
// Pair 형태로 받은 인자들을 포함하는 읽기 전용 맵을 반환함.

// fun <K, V> mapOf(pair : Pair<K, V>) : Map<K, V>
// 인자로 받은 pair 하나만을 요소로 갖는 읽기 전용 맵을 반환함.

// fun <K, V> mapOf() : Map<K, V>
// 비어있는 읽기 전용 맵을 반환함.

// fun <K, V> mutableMapOf(vararg pairs : Pair<K, V>) : MutableMap<K, V>
// Pair 형태로 받은 인자들을 포함하는 수정 가능한 맵을 반환함.

// fun <K, V> mutableMapOf() : MutableMap<K, V>
// 비어있는 수정 가능한 맵을 반환함.

fun main(args: Array<String>) {
    // Pair 를 직접 사용하는 예
    val cities1 = mapOf(Pair("SEO", "Seoul"), Pair("TOK", "Tokyo"), Pair("MTV", "Mountain View"))

    // 표준 라이브러리 내 함수 to를 사용하여 Pair 를 직관적으로 표현한 예
    val cities2 = mapOf("SEO" to "Seoul", "TOK" to "Tokyo", "MTV" to "Mountain View")
}

// fun <K, V> hashMapOf(vararg pairs : Pair<K, V>) : HashMap<K, V>
// Pair 형태로 받은 인자들을 포함하는 HashMap 형태의 맵을 반환함.

// fun <K, V> hashMapOf() : HashMap<K, V>
// 비어있는 HashMap 형태의 맵을 반환함.

// fun <K, V> linkedMapOf(vararg pairs : Pair<K, V>) : LinkedHashMap<K, V>
// Pair 형태로 받은 인자들을 포함하는 LinkedHashMap 형태의 맵을 반환함.

// fun <K, V> linkedMapOf() : LinkedHashMap<K, V>
// 비어있는 LinkedHashMap 형태의 맵을 반환함.

// fun <K, V> sortedMapOf(vararg : pairs : Pair<K, V>) : SortedMap<K, V>
// Pair 형태로 받은 인자들을 포함하는 SortedMap 형태의 맵을 반환함.