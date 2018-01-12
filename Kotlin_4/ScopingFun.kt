package Kotlin_4

// fun <T, R> T.let(block : (T) -> R) : R
// 이 함수를 호출하는 객체를 이어지는 함수형 인자 block 의 인자로 전달하며, block 함수의 결과를 반환함.

// fun <T> T.apply(block : T.() -> Unit) : T
// 이 함수를 호출하는 객체를 이어지는 함수형 인자 block 의 리시버로 전달하며, 함수를 호출한 객체를 반환함.

// fun <T, R> with(receiver : T, block : T.() -> R) : R
// 인자로 받은 객체 receiver 를 이어지는 함수형 인자 block 의 리시버로 전달하며, block 함수의 결과를 반환함.

// fun <R> run(block : () -> R) : R
// 함수형 인자 block 을 호출하고 그 결과를 반환함.

// fun <T, R> T.run(block : T.() -> R) : R
// 이 함수를 호출한 객체를 함수형 인자 block 의 리시버로 ㅓㄴ달하고 그 결과를 반환함.