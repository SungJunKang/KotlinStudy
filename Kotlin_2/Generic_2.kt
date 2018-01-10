package Kotlin_2

class Car{
}

// 항목을 담거나 뺼 수 있는 Generic 인터페이스 Container 정의
interface Container<T>{
    fun put(item : T)

    fun take() : T
}

// 자동차(Car)를 담거나 뺼 수 있는 클래스 Garage 정의
class Garage : Container<Car>{
    override fun put(item: Car) {

    }

    override fun take(): Car {
        return Car()
    }
}