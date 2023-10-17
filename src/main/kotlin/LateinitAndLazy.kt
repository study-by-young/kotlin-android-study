fun main(args: Array<String>) {

    // lateinit : var(변수)에 사용
    lateinit var lunch : String
    lunch = "waffle"
    println(lunch)

    // lazy : val(상수)에 사용
    val lazyLion : String by lazy {
        println("Lion is coming!") // 초기화 구문
        "lion"
    }
    println(" : : : First try : : : ")
    println(lazyLion)
    println(" : : : Second try : : :")
    println(lazyLion)

}