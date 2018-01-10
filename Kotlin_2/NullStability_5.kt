package Kotlin_2

// data2 프로퍼티는 null 값을 포함할 수 있음.
class Record(val data1 : String, val data2 : String?)

class Person1(record: Record){
    val name : String

    val adress : String

    init {
        name = record.data1
        // Person 클래스를 생성할 때 인자로 받은 Record 객체 내 data 프로퍼티는 null 값을 포함하지 않음을 보증함.
        adress = record.data2!!
    }
}