package Kotlin_3

class Volume2(var left : Int, var right : Int){
    // '==' 연산자를 재정의함.
    // Java 에서 equals() 메서드를 재정의하는 방식과 동일함.
    override fun equals(other: Any?): Boolean {
        if(other == this){
            return true
        }
        if(other !is Volume){
            return false
        }

        return other.left == this.left && other.right == this.right
    }
}