package Kotlin_4

// fun <T> setOf(vararg elements : T) : Set<T>
// 인자로 받은 elements 를 요소로 하는 읽기 전용 집합을 반환함.

// fun <T> setOf(element : T) : Set<T>
// 인자로 받은 element 하나만을 요소로 하는 읽기 전용 집합을 반환함.

// fun <T> setOf() : Set<T>
// 비어있는 읽기 전용 집합을 반환함.

// fun <T> mutableSetOf(vararg elements : T) : MutableSet<T>
// 인자로 받은 elements 를 요소로 하는 수정 가능한 집합을 반환함.

// fun <T> mutableSetOf() : MutableSet<T>
// 비어있는 수정 가능한 집합을 반환함.

// fun <T> hashSetOf(vararg elements : T) : HashSet<T>
// 인자로 받은 elements 를 포함하는 HashSet 형태의 집합을 반환함.

// fun <T> hashSetOf() : HashSet<T>
// 비어있는 HashSet 형태의 집합을 반환함.

// fun <T> linkedSetOf(vararg elements : T) : LinkedHashSet<T>
// 인자로 받은 elements 를 포함하는 LinkedHashSet 형태의 집합을 반환함.

// fun <T> linkedSetOf() : LinkedHashSet<T>
// 비어 있는 LinkedHashSet 형태의 집합을 반환함.

// fun <T> sortedSetOf(comparator : Comparator<in T>, vararg elements : T) : TreeSet<T>
// 인자로 받은 elements 를 포함하는 SortedSet 형태의 집합을 반환하며,
// 요소의 정렬 기준으로 comparator 를 사용함.

// fun <T> sortedSetOf(vararg elements : T) : TreeSet<T>
// 인자로 받은 elements 를 포함하는 SortedSet 형태의 집합을 반환함.