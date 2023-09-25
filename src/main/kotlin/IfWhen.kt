fun main(args: Array<String>) {

    // 1. If
    val examResult = isPass(50)
    println("exam result is $examResult")

    val is3Contained = is3Contained(5 .. 10)
    println("is3Contained result is $is3Contained")

    // 2. When
    val myGrade = getGrade(80)
    println("my grade is $myGrade")

}

fun isPass(examScore : Int) : Boolean {
    if (examScore >= 60) {
        return true
    } else {
        return false
    }
}

fun is3Contained(intRange : IntRange) : Boolean {
    if (intRange.contains(3)) {
        return true
    } else {
        return false
    }
}

fun getGrade(score : Int) : Char {
    when (score) {
        in 0 .. 40 -> return 'D'
        in 41 .. 70 -> return 'C'
        in 71 .. 90 -> return 'B'
        in 91 .. 100 -> return 'A'
        else -> return 'Z'
    }
}