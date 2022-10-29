package chapter4

import java.awt.Graphics
import java.awt.Shape
import javax.swing.text.Position
import javax.swing.text.View

class Button : Animated(),Clickable, Focusable {
    override fun click() {
        println("버튼 클릭!")

        Outer().Inner().getInnerTest()
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun animate() {
        animateTwice()
    }

    override fun stopAnimating() {
        println("open을 통한 비수창 함수도 오버라이드 가능")
        super.stopAnimating()
    }

}

open class RichButton: Clickable {

    fun disable() { } // 이 함수는 final이므로 하위 클래스는 이 메소드를 오버라이드 할 수 없다.

    open fun animate() { } // 이 함수는 open이므로 하위 클래스에서 이 메소드를 오버라이드해도 된다.

    // 오버라이드한 메소드는 기본적으로 open.
    override fun click() { }

}

open class TalkativeButton : Focusable {
    fun yell() = println("Hey!")
    fun whisper() = println("Let's talk!")
}

fun TalkativeButton.giveSpeesh() {
    yell()
    whisper() // 오류: "whisper"에 접근할 수 없음: "whisper"는 "TalkativeButton"의 "protected" 멤버임
}