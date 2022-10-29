package chapter4

class Outer {
    val test = 0
    inner class Inner {
        val test = 1
        fun getOuterReference(): Outer = this@Outer
        fun getInnerTest() {
            println("test : ${this@Inner.test}")
        }
        fun getOuterTest() {
            println("test : ${this@Outer.test}")
        }
    }
}
