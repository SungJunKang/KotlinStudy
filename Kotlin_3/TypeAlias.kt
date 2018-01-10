package Kotlin_3

// 사람 정보를 저장하는 리스트
typealias PeopleList = List<Person>

// 특정 태그를 가진 사람의 리스트를 포함하는 맵
typealias PeopleInTags = Map<String, Person>

// 인자로 받은 사람에게 메시지를 보내는 함수
fun sendMessage(people : List<Person>){
    people.forEach{
        // 메시지 전송
    }
}