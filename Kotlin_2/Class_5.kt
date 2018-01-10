package Kotlin_2

class Foo1(val a : Int, var b : Char)

class Foo2(val a : Int, var b : Char){
    // a 의 값만 인자로 받는 추가 생성자
    // 기본 생성자를 반드시 호출해야 함.
    constructor(a : Int) : this(a, '0')

    // 두 인자의 값을 모두 0으로 지정하는 생성자
    constructor() : this(0, '0')
}