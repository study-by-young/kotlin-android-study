fun main(args: Array<String>) {

    /**
     * 범위클래스 (Range Class)
     * 특정 범위의 값들을 간편하게 표현할 수 있음
     * */

    val numRange : IntRange = 1 .. 5
    println(numRange.contains(3))

    val charRange : CharRange = 'a' .. 'e'
    println(charRange.contains('z'))


    // 1. For

    for (i in 1 .. 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println("until $i")
    }

    for (i in 10 downTo 1) {
        println("downTo $i")
    }

    for (i in 1 .. 10 step 2) { // 간격
        println("step $i")
    }


    // 2. While

    var num = 3
//    while (num < 5) {
//        println("current number $num")
//        num++
//    }

    do {
        println("current number $num")
        num++
    } while (num < 5)

}