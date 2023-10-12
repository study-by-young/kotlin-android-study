fun main(args: Array<String>) {

    /**
     * public: 어디에서나 접근 가능 (기본 접근 제한자)
     * internal: 같은 모듈 내에서 접근 가능
     * protected: 자식 클래스에서만 접근 가능
     * private: 해당 클래스 내부에서만 접근 가능
     * */

    val a = A()
    println("a.a : ${a.a}")
    println("a.b : ${a.b}")

    val b = B()
//    println("b.c : ${b.c}")
    println("b.d : ${b.d}")

    val c = C()
//    println(c.e)
//    println(c.f)
    println(c.g)

    val d = D()
//    d.printCProperties()
    d.callPrintC()

}

public class A {
    public val a = 1
    val b = 2
}

class B {
    private val c = 3
    public val d = 4
}

open class C {
    protected val e = 5
    private val f = 6
    public val g = 7
}

class D : C() {
    private fun printCProperties() {
        println("e : $e")
//        println("f : $f")
        println("g : $g")
    }

    public fun callPrintC() {
        printCProperties()
    }
}