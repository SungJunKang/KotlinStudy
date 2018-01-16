package Kotlin_5;

public class FunctionWithDefaultParameters {
    // 기본 매개변수를 사용하는 것과 유사하게, 일부 인자만으로도 객체를 생성할 수 있음.
    Person3 p1 = new Person3("KangSungJun");
    Person3 p2 = new Person3("KangSungJun", "SomeWhere");

    // 모든 인자를 다 입력할 수도 있음.
    Person3 p3 = new Person3("KangSungJun", "SomeWhere", true);

    // 기본 매개변수를 사용하는 것과 유사하게, 일부 인자만으로도 메서드를 호출할 수 있음.
}
