package Kotlin_2

class Outer{
    // 키워드가 없으면 정적 중첩 클래스로 간주
    class StaticNested{

    }

    // inner 키워드를 사용하여 비 정적 중첩 클래스 선언
    inner class NonStaticNested{

    }
}

fun main(args: Array<String>) {
    // 정적 중첩 클래스 : Outer 클래스의 인스턴스 생성 없이 인스턴스 생성 가능
    val staticInstance = Outer.StaticNested()

    // 비 정적 중첩 클래스 : Outer 클래스의 인스턴스를 생성해야 인스턴스 생성 가능
    val nonStaticInstance = Outer().NonStaticNested()
}