package chapter4

class Chapter4 {
    val button = Button()
    val inner = Outer().Inner()

    fun onClickButton() {
        button.animate()
        button.click()
        button.setFocus(true)
        button.showOff()
        button.stopAnimating()
    }

    fun nestedClass() {
        println("inner.getOuterTest() : ${inner.getOuterTest()}")
        println("inner.getInnerTest() : ${inner.getInnerTest()}")
    }
}