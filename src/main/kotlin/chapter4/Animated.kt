package chapter4

// Animated 클래스는 추상 클래스이므로 인스턴스화 할 수 없다.
abstract class Animated {
    // animate()는 추상 함수다.
    // 이 함수에는 구현이 없다. 하위 클래스에서는 반드시 이 함수를 오버라이드해야함.
    abstract fun animate()

    // 추상 클래스에 속했떠라도 비추상 함수는 기본적으로 fianl이지만 원한다면 open으로 오버라이드를 허용할 수 있다.
    open fun stopAnimating() {
        println("Animated stopAnimating()")
    }

    // 추상 클래스에 속했떠라도 비추상 함수는 기본적으로 fianl이지만 원한다면 open으로 오버라이드를 허용할 수 있다.
    fun animateTwice() {
        println("Animated AnimateTwice()")
    }
}