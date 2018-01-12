package Kotlin_4

// fun <T> listOf(vararg elements : T) : List<T>
// 인자로 받은 elements 를 포함하는 읽기 전용 리스트를 반환함.

// fun <T> listOf(element : T) : List<T>
// 인자로 받은 element 하나만을 요소로 갖는 읽기 전용 리스트를 반환함.

// fun <T> listOf() : List<T>
// 비어있는 읽기 전용 리스트를 반환함.

// fun <T : Any> listOfNotNull(vararg elements : T?) : List<T>
// 인자로 받은 elements 중 null 이 아닌 값들로만 구성된 읽기 전용 리스트를 반환함.
// 만약 인자로 전달된 모든 값이 null 갑이 아니라면 빈 리스트를 반환함.

// fun <T : Any> listOfNotNull(element : T?) : List<T>
// 인자로 받은 element 의 값이 null 이 아닌 경우 이 요소 하나만을 갖는 리스트를 반환하며,
// null 값인 경우에는 빈 리스트를 반환함.

fun main(args: Array<String>) {
    // null 값이 아닌 인자가 아무것도 없으므로, listOfCountries 에는 빈 리스트가 생성됨.
    val listOfCountries = listOfNotNull(null)

    // null 값인 인자는 무시하므로, "Seoul", "Tokyo"만을 요소로 갖는 리스트가 생성됨.
    val listOfCities = listOfNotNull("Seoul", null, "Tokyo", null)
}

// ----------------------------------------------------------------------------

// fun <T> mutableListOf(vararg elements : T) : MutableList<T>
// 인자로 받은 elements 를 요소로 가지며 수정 가능한 리스트를 반환함.

// fun <T> mutableListOf() : MutableList<T>
// 비어 있는 수정 가능한 리스트를 반환함.

// fun <T> arrayListOf(vararg elements : T) : ArrayList<T>
// 인자로 받은 elements 를 요소로 하는 ArrayList 를 반환함.

// fun <T> arrayListOf() : ArrayList<T>
// 비어 있는 ArrayList 를 반환함.